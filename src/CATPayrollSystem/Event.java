/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CATPayrollSystem;

import java.util.Date;
import java.util.List;
import sun.security.krb5.internal.EncAPRepPart;

/**
 *
 * @author Jose, Casey and Azry
 */
public class Event {
    
    private EventType eventType;
    private Date eventDate;
    private Employee employee;
    private boolean isProcessed;
    private List<Entry> accountingEntries;

    public Event(EventType eventType, Date eventDate, Employee employee) {
        this.eventType = eventType;
        this.eventDate = eventDate;
        this.employee = employee;
    }
        
    public void process(){
        findRule().process(this);//Execute the posting rule
    }
    
    private PostingRule findRule(){//Search the posting rule related to the event and the employee
        PostingRule rule= employee.getAgreement().getPostingRule(this.getEventType());
        if(rule == null) throw new NullPointerException("not such rule for this event, your wrong");
        return rule;
    }

    public EventType getEventType() {
        return eventType;
    }

    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public boolean isIsProcessed() {
        return isProcessed;
    }

    public void setIsProcessed(boolean isProcessed) {
        this.isProcessed = isProcessed;
    }
    
   
}

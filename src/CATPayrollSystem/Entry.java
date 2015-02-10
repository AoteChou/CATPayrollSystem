/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CATPayrollSystem;

import java.util.Date;

/**
 *
 * @author eddychou
 */
public class Entry {
    private Double amount;
    private Date entryTime;
    private Employee employee;
    private Date eventTime;
    private EventType eventType;

    public Entry() {
    }

    
    public Entry(Double amount, Date entryTime, Employee employee, Date eventTime, EventType evnetType) {
        this.amount = amount;
        this.entryTime = entryTime;
        this.employee = employee;
        this.eventTime = eventTime;
        this.eventType = eventType;
        
    }

    /**
     * @return the ammount
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * @param amount the ammount to set
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    /**
     * @return the entryTime
     */
    public Date getEntryTime() {
        return entryTime;
    }

    /**
     * @param entryTime the entryTime to set
     */
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    /**
     * @return the eventTime
     */
    public Date getEventTime() {
        return eventTime;
    }

    /**
     * @param eventTime the eventTime to set
     */
    public void setEventTime(Date eventTime) {
        this.eventTime = eventTime;
    }

    /**
     * @return the eventType
     */
    public EventType getEventType() {
        return eventType;
    }

    /**
     * @param eventType the eventType to set
     */
    public void setEventType(EventType eventType) {
        this.eventType = eventType;
    }
    
    
    
}

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
public class JuniorDeveloperOverTimeRule extends PostingRule {

    public static double juniorOverTimeRate;

    public JuniorDeveloperOverTimeRule() {
        
        super();
        eventType = EventType.OvertimeHours;
        juniorOverTimeRate = 10;
    }
    
    
    @Override
    public double calculateAmount(double hours) 
    {
        return hours * juniorOverTimeRate;
    }

    @Override
    public void createEntry(Event currEvent) {
        
        Employee currEmployee = currEvent.getEmployee();
        double currHours = ((WorkingEvent) currEvent).getWorkingHours();
        Entry myEntry = new Entry();
        myEntry.setEntryTime(new Date());
        myEntry.setEventTime(currEvent.getEventDate());
        myEntry.setEmployee(currEmployee);
        myEntry.setAmount(calculateAmount(currHours));
        myEntry.setEventType(eventType);
        
        Account currAccount = currEmployee.getAccount(0);
        currAccount.getAccountEntries().add(myEntry);
        
        currEvent.getAccountingEntries().add(myEntry);
        System.out.print(myEntry.getEmployee().getName()+": ");
        System.out.println(myEntry.getAmount());
        System.out.println(TimeParser.parseTime(myEntry.getEntryTime()));
        System.out.println(TimeParser.parseTime(myEntry.getEventTime()));
        
        
        
    }
    
}

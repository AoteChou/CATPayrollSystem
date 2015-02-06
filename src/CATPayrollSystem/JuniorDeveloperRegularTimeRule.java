/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CATPayrollSystem;

import apple.laf.JRSUIConstants;
import java.util.Date;

/**
 *
 * @author eddychou
 */
public class JuniorDeveloperRegularTimeRule extends PostingRule {

    public static double juniorRegularRate;

    public JuniorDeveloperRegularTimeRule() {
        super();
        eventType = EventType.JuniorRegularHours;
        juniorRegularRate = 5;
    }
   
    
    @Override
    public double calculateAmount(double hours) 
    {
        return hours * juniorRegularRate;
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
        
        Account currAccount = currEmployee.getAccount(0);
        currAccount.getAccountEntries().add(myEntry);
        
        currEvent.getAccountingEntries().add(myEntry);
        System.out.println(myEntry.getAmount());
        System.out.println(myEntry.getEntryTime().toString());
        System.out.println(myEntry.getEventTime().toString());
        System.out.println(myEntry.getEmployee().getName());
        
        
        
    }


    
}

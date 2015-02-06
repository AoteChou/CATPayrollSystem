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
public class JuniorDeveloperRegularTimeRule extends PostingRule {

    public static double juniorRegularRate;
   
    @Override
    public double calculateAmount(double hours) 
    {
        return hours * juniorRegularRate;
    }

    @Override
    public void createEntry(Event currEvent) {
        
        Employee currEmployee = currEvent.getEmployee();
        double currHours = currEvent.getHours();
        Entry myEntry = new Entry();
        myEntry.setEntryTime(new Date());
        myEntry.setEventTime(currEvent.getDate());
        myEntry.setEmployee(currEmployee);
        myEntry.setAmount(calculateAmount(currHours));
        Account currAccount = currEmployee.getAccount(1);
        currAccount.getAccountEntries().add(myEntry);
        
        
    }


    
}

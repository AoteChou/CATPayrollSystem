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
public class BonusRule extends PostingRule {


    public BonusRule() {
        eventType = EventType.BonusPayment;
    }

    @Override
    public double calculateAmount(double bonusAmount) {
        return 0;
    }

    @Override
    public void createEntry(Event currEvent) {

        Employee currEmployee = currEvent.getEmployee();
        double bonusAmout = ((BonusPaymentEvent) currEvent).getBonusPaid();
        Entry myEntry = new Entry();
        myEntry.setEntryTime(new Date());
        myEntry.setEventTime(currEvent.getEventDate());
        myEntry.setEmployee(currEmployee);
        myEntry.setAmount(bonusAmout);
        myEntry.setEventType(eventType);

        Account currAccount = currEmployee.getAccount(0);
        currAccount.getAccountEntries().add(myEntry);

        currEvent.getAccountingEntries().add(myEntry);

        System.out.print(myEntry.getEmployee().getName() + ": ");
        System.out.println(myEntry.getAmount());
        System.out.println(TimeParser.parseTime(myEntry.getEntryTime()));
        System.out.println(TimeParser.parseTime(myEntry.getEventTime()));
    }

}

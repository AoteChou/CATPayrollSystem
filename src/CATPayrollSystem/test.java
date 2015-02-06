/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CATPayrollSystem;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author eddychou
 */
public class test {
    public static void main(String[] args) {
        
        Agreement caseyAgreement=new Agreement();
        caseyAgreement.getPostingRulesList().add(new JuniorDeveloperRegularTimeRule());
        
        List<Account> accountList=new ArrayList<Account>();
        accountList.add(new Account(1111, 0));
        
        
        Employee casey=new Employee("Casey", caseyAgreement,accountList);
        WorkingEvent myWorkingEvent=new WorkingEvent(EventType.JuniorRegularHours, new Date(), casey, 10);
        
        
        myWorkingEvent.process();
    }
}

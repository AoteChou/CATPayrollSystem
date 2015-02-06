/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CATPayrollSystem;

import java.util.List;

/**
 *
 * @author eddychou
 */
public class Employee {

   
    
    private String name;
    private Agreement agreement;
    private List<Entry> accountingEntries; 
    private List<Account> employeeAccountsList;

    public Employee(String name, Agreement agreement, List<Account> employeeAccountsList) {
        this.name = name;
        this.agreement = agreement;
        this.employeeAccountsList=employeeAccountsList;
        
    }

    

    public Agreement getAgreement() {
        return agreement;
    }

    public void setAgreement(Agreement agreement) {
        this.agreement = agreement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public List<Entry> getAccountingEntries() {
        return accountingEntries;
    }

    public void setAccountingEntries(List<Entry> accountingEntries) {
        this.accountingEntries = accountingEntries;
    }
    
    public void addAccountingEntries(Entry accountingEntry) {
        accountingEntries.add(accountingEntry);
    }

    /**
     * @return the employeeAccountsList
     */
    public List<Account> getEmployeeAccountsList() {
        return employeeAccountsList;
    }

    /**
     * @param employeeAccountsList the employeeAccountsList to set
     */
    public void setEmployeeAccountsList(List<Account> employeeAccountsList) {
        this.employeeAccountsList = employeeAccountsList;
    }
    
     Account getAccount(int i) {
        return employeeAccountsList.get(i);
    }
    
}

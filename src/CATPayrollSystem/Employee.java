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
    
    private int employeeId;
    private String name;
    private String position;
    private Agreement agreement;
    private List<Entry> accountingEntries; 

    public Employee(int employeeId, String name, String position, Agreement agreement) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.agreement = agreement;
    }

    public Employee(int employeeId, String name, Agreement agreement) {
        this.employeeId = employeeId;
        this.name = name;
        this.agreement = agreement;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
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

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + '}';
    }
    
}

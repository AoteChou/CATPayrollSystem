/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CATPayrollSystem;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author eddychou
 */
public class Account {
    private int accountID;
    private double balance;
    private List<Entry> accountEntries;

    public Account(int accountID, double balance) {
        this.accountID = accountID;
        this.balance = balance;
        this.accountEntries = new ArrayList<Entry>();
    }
    
    

    /**
     * @return the accountID
     */
    public int getAccountID() {
        return accountID;
    }

    /**
     * @param accountID the accountID to set
     */
    public void setAccountID(int accountID) {
        this.accountID = accountID;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * @return the accountEntries
     */
    public List<Entry> getAccountEntries() {
        return accountEntries;
    }

    /**
     * @param accountEntries the accountEntries to set
     */
    public void setAccountEntries(List<Entry> accountEntries) {
        this.accountEntries = accountEntries;
    }

    
    
}

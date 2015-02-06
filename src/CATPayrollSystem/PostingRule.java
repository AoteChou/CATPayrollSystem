/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CATPayrollSystem;

/**
 *
 * @author eddychou
 */
public abstract class PostingRule {
    EventType eventType;
    double salary;
    
    public void createEntry()
    {
        
    }
    
    public abstract double calculateAmount();
}

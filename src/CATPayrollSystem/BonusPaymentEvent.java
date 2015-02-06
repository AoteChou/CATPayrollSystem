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
public class BonusPaymentEvent extends Event{

    private double bonusPaid;
    
    public BonusPaymentEvent(EventType eventType, Date eventDate, Employee employee, double bonusPaid) {
        super(eventType, eventDate, employee);
        this.bonusPaid = bonusPaid;
    }

    public double getBonusPaid() {
        return bonusPaid;
    }

    public void setBonusPaid(double bonusPaid) {
        this.bonusPaid = bonusPaid;
    }
    
}

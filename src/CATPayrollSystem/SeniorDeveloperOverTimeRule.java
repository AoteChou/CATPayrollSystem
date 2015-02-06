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
public class SeniorDeveloperOverTimeRule extends PostingRule {

    public static double seniorRegularRate;
    @Override
    public double calculateAmount(double hours) 
    {
        return hours * seniorRegularRate;
    }


}

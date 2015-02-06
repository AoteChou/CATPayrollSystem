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
public class SeniorDeveloperRegularTimeRule extends PostingRule {

    public static double seniorOverTimeRate;
    @Override
    public double calculateAmount(double hours) 
    {
        return hours * seniorOverTimeRate;
    }

   
}

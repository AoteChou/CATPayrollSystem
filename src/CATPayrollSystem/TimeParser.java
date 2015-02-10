/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CATPayrollSystem;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author eddychou
 */
public class TimeParser {
    public static String parseTime(Date date){
        
        SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd hh:mm");
        return sdf.format(date);
        
    }
    
}

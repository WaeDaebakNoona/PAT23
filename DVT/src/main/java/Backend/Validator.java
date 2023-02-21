/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author Naritaa
 */
public class Validator {
    
//    public static void checkName(String name){
//        
//    }
    
    public static boolean checkAge(int age, String date){
        //if int is already checked my gui component
        int personAge = age;
        DateTimeFormatter inputDtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthdate = LocalDate.parse(date, inputDtf);
        LocalDate nowDate = LocalDate.now();
        Period difference = Period.between(birthdate, nowDate);
        if(difference.getYears() == personAge){
            return true;
        }
        return false;
    }
//    public static boolean checkDateFormat(Date date){
//        
//        return false;
//    }
}

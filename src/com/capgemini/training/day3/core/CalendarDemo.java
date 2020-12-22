package com.capgemini.training.day3.core;

/*@ankita
 * calender and gregorein class
 */

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDemo {

	 

    public static void main(String[] args) {
        //Calendar is an abstract class
        //Calendar today = new Calendar();
        //GregorianCalendar is a sub class of Calendar
        // and it is concrete class, means can be instantiated
        Calendar today= new GregorianCalendar();
        System.out.println(today);
        //returns instance of GregorianCalendar
        Calendar today1= Calendar.getInstance();
        System.out.println(today1);
        Calendar birthdate=new GregorianCalendar(1998,0,10,10,15,30);
        System.out.println(birthdate);
        Date birthdateInDate= birthdate.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        String birthdateInString= sdf.format(birthdateInDate);
        System.out.println(birthdateInString);

 

    }

 

}
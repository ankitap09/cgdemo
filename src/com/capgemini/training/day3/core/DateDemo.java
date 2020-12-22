package com.capgemini.training.day3.core;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @author Srini
 * This class demonstrates legacy classes, Date,Calendar
 * and GregorianCalendar
 */
public class DateDemo {

 

    public static void main(String[] args)  {
        Date today=new Date();
        System.out.println(today);
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        //convert Date to String
        String todayFormatted = sdf.format(today);
        System.out.println(todayFormatted);
        String birthdate= "10-JULY-1998";
        //convert String to Date
        SimpleDateFormat sdf1=new SimpleDateFormat("dd-MMMM-yyyy");
        try {
            Date myBirthdate= sdf1.parse(birthdate);
            System.out.println("Birthdate: "+ myBirthdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        
        Long timeInMillis= new Date().getTime();
        System.out.println(timeInMillis);
        
        Date hiredate= new Date(1605154856322L);        
        System.out.println("Hiredate: " + hiredate);
    }

 

}

/*
/*@ankita
 * this class demonstartes date ,legacy classes, calender
 * gregoriancalender
 

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		
		//convert date to string
		String todayFormated = sdf.format(today);
		System.out.println(todayFormated);
		
		//convert string to date
		String birthDate = "09-MAY-1998";
		
		
		
		
	}

}
*/
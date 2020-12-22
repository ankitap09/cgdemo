package com.capgemini.training.day3.core;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateDemo {

 

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate independanceDay = LocalDate.of(1947,Month.AUGUST,15);
        System.out.println("Today:"+ currentDate);
        System.out.println("Independance:"+ independanceDay);
        
        LocalDate tomorrow=currentDate.plusDays(1);
        System.out.println("Tomorrow:"+ tomorrow);
        System.out.println("Last Month:"+currentDate.minusMonths(1));
        System.out.println("Is Leap?:"+ currentDate.isLeapYear());
        LocalDate lastDay= currentDate.withDayOfMonth(30);
        System.out.println("Move to 30th day of month:"+ lastDay);
        System.out.println("Number of days in this month:"+ 
                                    currentDate.lengthOfMonth());
        
        LocalDateTime todayWithTime = LocalDateTime.now();
        System.out.println(todayWithTime);
        
        LocalDateTime hiredate = LocalDateTime.of(1998,Month.JANUARY,10,8,15,30,115);
        System.out.println(hiredate);
        
    }
}
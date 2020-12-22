package com.capgemini.training.day3.core;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CalculatingPeriod {

 

    public static void main(String[] args) {
        
        LocalDate start = LocalDate.of(1947,Month.AUGUST,15);
        LocalDate end = LocalDate.now();
        
        Period period = start.until(end);
        
        System.out.println("Days:"+ period.getDays());
        System.out.println("Months:"+period.getMonths());
        System.out.println("Years:"+ period.getYears());
        
        System.out.println("--------------------");
        LocalDate birthdate= LocalDate.of(1998,10, 15);
        Period elapsed= birthdate.until(end);
        System.out.println("Days:"+ elapsed.getDays());
        System.out.println("Months:"+elapsed.getMonths());
        System.out.println("Years:"+ elapsed.getYears());
        
        
        System.out.println("---------------------------");
        System.out.println(Instant.now());
        System.out.println(Instant.MAX);
        System.out.println(Instant.MIN);
    }
}
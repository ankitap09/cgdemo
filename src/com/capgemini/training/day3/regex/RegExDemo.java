package com.capgemini.training.day3.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class RegExDemo {

	 

    public static void main(String[] args) {
        String inputStr = "Hi! This is a Test String";
        String pattern = "Test String";
        System.out.println(inputStr.matches(pattern)); //false
        System.out.println(inputStr.contains(pattern)); //true

 

        boolean patternMatched = Pattern.matches(pattern, inputStr);           
        System.out.println(patternMatched);

 

        String input = "Shop,Mop,Hopping,Chopping";
        Pattern pattern1 = Pattern.compile("op");
        Matcher matcher = pattern1.matcher(input);
        System.out.println(matcher.matches());
        while (matcher.find()){
            System.out.println(matcher.group() + ": " +
                    matcher.start() + ": " + matcher.end());
        }
        System.out.println("------------------------------");
//        String inputText = "Ex01"; 
        String inputText = "A1A1A2A2A1A2A2"; 
        System.out.println(Pattern.matches("^[A-Z][0-9]$",inputText));

 

        //Checks for string that start with upper case alphabet and end with digit. 
//        Pattern p = Pattern.compile("^[A-Z][0-9]$");
        Pattern p = Pattern.compile("A1A2");

 

        Matcher m = p.matcher(inputText); 
        System.out.println(m.find());
        System.out.println(m.find());
        if (!m.find()) {
            System.err.println("Enter  code which  start with"
                    + " upper case alphabet and end with a digit");
        }

 


    }

 

}
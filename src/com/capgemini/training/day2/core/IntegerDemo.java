package com.capgemini.training.day2.core;
public class IntegerDemo {

 

    public static void main(String[] args) {
        int marks=89;
        //wrapping primitive type to Integer type
        Integer marksObj= new Integer(marks);
        //From JDk5, auto-boxing
        //implicit conversion of primitive type to object type
        int age=28;
        //auto-boxing
        Integer ageObj= age;
        //object-type to primitive type
        int myMarks= marksObj.intValue();
        System.out.println(myMarks);
        //Auto-unboxing : converting object-type to primitive type
        int myMarks1= marksObj;

 

        //converting String object to int

 

        String s1= "12345";

 

        int x= 5+ Integer.parseInt(s1);
        System.out.println(x);

 

        String s2= "4.56";
        double d = Double.parseDouble(s2);
        try {
            String s3="abc";
            int z= Integer.parseInt(s3);
        }catch(NumberFormatException e) {
            System.out.println("Invalid data");
            e.printStackTrace();
        }

 

 

    }

 

}
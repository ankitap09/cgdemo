package com.capgemini.training.day2.core;
public class StringDemo {
   public static void main(String args[]) {
         String str1 = "Hello";
         String str2 = new String(str1);
         System.out.println(str1 + " equals " + str2 + " -> " +
                       str1.equals(str2));
         System.out.println(str1 + " == " +
                 str2 + " -> " + (str1 ==str2));
        
         String str3= "Hello";
         System.out.println(str1==str3);
         String str4= new String(str1);
         System.out.println(str2==str4);
        
         System.out.println(str1.hashCode());
         System.out.println(str2.hashCode());
         System.out.println(str3.hashCode());
         System.out.println(str4.hashCode());
        
        System.out.println(str4.charAt(0));
        System.out.println(str4.indexOf('l'));
        System.out.println(str4.lastIndexOf('l'));
        System.out.println(str4.contains("lo"));
        System.out.println(str4.matches("[a-z]*"));
        int empid =12345 ;
        System.out.println(new Integer(empid).toString().matches("[0-9]*"));
        
        System.out.println(str4.substring(2));
        System.out.println(str4.substring(2,4));
        str1 =str1+"h";
        System.out.println(str1);
        
        
        String s1= "Hello,Welcome,To,Java";
        
        String [] list= s1.split(",");
        //for each loop
        for(String s:list) {
            System.out.println(s);
        }
        //same as
        for(int i=0;i<list.length;i++) {
            System.out.println(list[i]);
        }
        
        /*
        System.out.println("--------------------");
        String s2 = "Hello";
        String s3 = s2.intern();//"hello".intern()
        String s4 = "hi".intern();
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        */
        
      //placed in String pool
        String s2= "Hello";
        //placed in heap
        String s3= new String("Hello");
        //returns reference of "Hello" which is in String pool
        String s4= new String("Hello").intern();
        //placed in heap
        String s5=new String("Hi").intern();
        System.out.println(s2==s3); //false
        System.out.println(s3==s4); //false
        System.out.println(s2==s4);//true
        
        
        String s6="";
        System.out.println(s6.length()==0);//true
        //better code
        System.out.println(s6.isEmpty());//true
   }
}
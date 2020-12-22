package com.capgemini.training.day3.Arrays;

import static java.lang.System.*;
public class Varargs {
    //varargs receives 0 or more arguments
    static void print(int a, int b, String ... c) {
        out.println(a + "," + b);
        for (int i = 0; i < c.length; i++)
            out.print(c[i] + "\t");
        out.println();
    }
    
    static void print(String ... s) {
        for(String i: s) {
            out.println(i);
        }
    }
    
    static void print(int ... s) {
        for(int i: s) {
            out.println(i);
        }
    }

 

    public static void main(String[] arg) {
        print(3, 2, "java", "java 5");
        //print(1,2); ambiguity
        print("Hello");
        print(1, 2, "a", "b", "c", "d", "e","f");
    }
}
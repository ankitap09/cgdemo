package com.capgemini.training.day2.core;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Elapsed {

 

    public static void main(String args[]) throws IOException {
        long start, end;
        int i = 0, sum = 0;
        String str = null;
        System.out.println("Timing a for loop from 0 to 1,000,000");

 

        // time a for loop from 0 to 1,000,000    
        start = System.currentTimeMillis(); // get starting time
        
        //for(int j=0; j < 1000000; j++) ;
        try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        end = System.currentTimeMillis(); // get ending time

 

        System.out.println("Elapsed time: " + (end-start));
        
        long timeInMillies = System.currentTimeMillis();
        System.out.println("Time in Elapsed :"+timeInMillies);
        long  years    = timeInMillies/(1000L*60*60*24*365);
        System.out.println(years);
   
 

        // Demo to read from the system input and write to standard output.
        BufferedReader br = new
          BufferedReader(new InputStreamReader(System.in));

 

        do {
            System.out.println("Enter 0 to quit");
            str = br.readLine();
            i = Integer.parseInt(str);
            if ( i == 0 )
                System.exit(0); // normal exit
            sum += i;
            System.out.println("Current sum is: " + sum);
        } while(i != 0);
    }
}
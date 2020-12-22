package com.capgemini.training.day3.Arrays;

import java.util.Scanner;

import com.capgemini.training.day2.Box;
import com.capgemini.training.day2.BoxManager;

public class BoxArrayDemo {
    private static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter number of boxes: ");
        int size= scanner.nextInt();
        //Array of references, allocated in heap
        Box boxes[]= new Box[size];
        for(int i=0;i<boxes.length;i++) {
            boxes[i]= new Box(i+1,i+2,i+3);
        }
        
        BoxManager manager= new BoxManager();
        System.out.println("Dimensions of the boxes..");
        for(Box b: boxes) {
            System.out.println(b+ " Volume: "+manager.calculateVolume(b));
        }
        

 

    }

 

}
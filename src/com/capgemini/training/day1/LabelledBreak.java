package com.capgemini.training.day1;
public class LabelledBreak {

 

    public static void main(String[] args) {
    int len = 5;
    int key = 2;
    int k = 0;
    out: {
      for (int i = 0; i < len; i++) {
        for (int j = 0; j < len; j++) {
          if (i == key) {
            break out;
          }
          k += 1;
        }
      }
    }
    System.out.println(k);
  }
}
 


/*
 * len=5 , key=2
i=0, 
 j=0 k=1
 j=1 k=2
 j=2 k=3
 j=3 k=4
 j=4 k=5
 j=5 False
1=1
  j=0 k=6
  j=1 k=7
  j=2 k=8
  j=3 k=9
  j=4 k=10
  j=5 False
i=2
 j=0
  if(2==2)  break out;

 

print k */
 
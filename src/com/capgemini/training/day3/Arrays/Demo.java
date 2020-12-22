package com.capgemini.training.day3.Arrays;
public class Demo {

 

    public static void main(String[] args) {
        int list[]= {1,2,3,4,5};
        display(list);
        System.out.println("--------------");
        display(new int[] {10,20,30,40,50});
        System.out.println("----------------");
        showData(new int[][] {{1,2,3},{4,5,6}});

 

    }

 

    private static void showData(int[][] is) {
        for(int i=0;i<is.length;i++) {
            for(int j=0;j<is[i].length;j++) {
                System.out.format("%-3d",is[i][j]);
            }
            System.out.println();
        }
        
    }

 

    private static void display(int list[]) {
        for(int l: list) {
            System.out.println(l);
        }
        
    }

 

}
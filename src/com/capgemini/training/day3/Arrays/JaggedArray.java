package com.capgemini.training.day3.Arrays;
public class JaggedArray {

 

    public static void main(String[] args) {
        int mat[][]= {
                         {10},
                         {20,30},
                         {40,50,60}
           };

 

    for(int i=0; i<mat.length;i++){
        
        for(int j=0;j<mat[i].length;j++) {
//            System.out.print(mat[i][j]+" ");
//            System.out.printf("%-3d", mat[i][j]);
            //System.out.format("%-3d", mat[i][j]);
            System.out.format("%4d", mat[i][j]);
        }
        System.out.println();
    }

 

}
}


/* jagged array with exception handling
public class JaggedArray {

 

    public static void main(String[] args) {
        int mat[][]= {
                {10},
                {20,30,30},
                {40,50,60,70}
        };
        try {
            for(int i=0; i<mat.length;i++){

 

                for(int j=0;j<mat[i].length;j++) {
                    //            System.out.print(mat[i][j]+" ");
                    //            System.out.printf("%-3d", mat[i][j]);
                    System.out.format("%-3d", mat[i][j]);
                }
                System.out.println();
            }
        }catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Exceeding array boundary");
//                e.printStackTrace();
//                System.out.println(e.getMessage());
        }
        System.out.println("End");

 

    }
}
*/
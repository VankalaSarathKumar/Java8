package com.cognizant.arrays;

public class ArrayTest3 {
    public static void main(String[] args) {
            int [][]x=new int[2][];//x is a 2 dimensional array with 2 one dimensional arrays
            x[0]=new int[3];//first 1 dimensional array has 3 elements
            x[1]=new int[2];//second 1 dimensional array has 2 elements
            //assigning value to first 1 dimensional array elements
            x[0][0]=4;
            x[0][1]=5;
            x[0][2]=1;
            
            //assigning value to second 1 dimensional array elements
            x[1][0]=7;
            x[1][1]=6;

            for(int i=0;i<x.length;i++) {
                    System.out.println();
                    for(int j=0;j<x[i].length;j++) {
                            System.out.print(x[i][j]+"\t");
                    }
            }
            
            System.out.println("\nusing enhanced for loop");
            
            for(int[] a:x) {//each element of x is one dimensional array
                System.out.println();
                for(int b:a) { //each element of the one dimensional array is an int
                        System.out.print(b+"\t");
                }
        }
        
            
            
    }

}


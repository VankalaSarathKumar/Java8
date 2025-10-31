package com.cognizant.training.exceptions;

public class ExceptionTest1 {
    public static void main(String[] args) {
            int x=10,y=0;
            
            System.out.println("Diving x by y");
            try {
            System.out.println(x/y);
            }catch(ArithmeticException e) {
                    //System.out.println("Invalid Division: "+e.getMessage());
                    e.printStackTrace();
            }
            finally {
                    System.out.println("within finally");
            }
            System.out.println("Done");
    }

}

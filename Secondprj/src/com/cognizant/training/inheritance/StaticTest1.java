package com.cognizant.training.inheritance;

class R{
    static int i;
    
    static void print() {
            System.out.println("This is a static method");
            System.out.println("The value of i: "+i);
    }
}

public class StaticTest1 {
public static void main(String[] args) {
    R r1=new R();
    r1.i=10;
    R r2=new R();
    r2.i=20;
    R r3=new R();
    //r3.i=30;
    
    int sum=r1.i+r2.i+r3.i;
    System.out.println(sum);
    
    System.out.println(R.i);
    
    R.print();
}
}


package com.cognizant.training.inheritance;

class A{
    int i=10;
}

class B extends A{
    int i=20;
    
    void print() {
    	int i=30;
            System.out.println(super.i);
            System.out.println(this.i);
            System.out.println(i);
    }
}

public class InheritanceTest1 {
public static void main(String[] args) {
    B b=new B();
    b.print();
}
}

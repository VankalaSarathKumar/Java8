package com.cognizant.training.inheritance;

class M{
    void print() {
            System.out.println("method of M");
    }
}

class N extends M{
    void print() {
            System.out.println("method of N");
    }
}

class O extends N{
    void print() {
            System.out.println("method of O");
    }
}


public class PolymorphismTest1 {
public static void main(String[] args) {
    M m=new N();
    m.print();
    m=new M();
    m.print();
    m=new O();
    m.print();
}
}

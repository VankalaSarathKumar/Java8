package com.cognizant.training.inheritance;

class Sample{
    void printData(M m) {
            m.print();
    }
}

public class PolymorphismTest2 {
public static void main(String[] args) {
    /*M m=new N();
    N n=(N)m;
    n.print();
    m.print();
    
    O o=(O)n;
    o.print();*/
    
    Sample sample=new Sample();
    sample.printData(new O());
    sample.printData(new M());
    sample.printData(new N());
}
}


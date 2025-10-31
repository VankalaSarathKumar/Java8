package com.cognizant.training.inheritance;

class X{
    X(int p){
            System.out.println("constructor of X: "+p);
    }
}

class Y extends X{
    Y(){
            super(10);
            System.out.println("constructor of Y");
    }
}
public class InheritanceTest2 {

    public static void main(String[] args) {
            // TODO Auto-generated method stub
            Y y=new Y();

    }

}


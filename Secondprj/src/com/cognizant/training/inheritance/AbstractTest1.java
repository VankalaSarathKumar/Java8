package com.cognizant.training.inheritance;

abstract class Animal{
    abstract String getColor() ;
    abstract int getLifeCycleTime();
    void describe() {
            System.out.println("Color:"+getColor());
            System.out.println("Life Cycle Time: "+getLifeCycleTime()+" years");
    }
}
class Elephant extends Animal{

            
    int getLifeCycleTime() {
            // TODO Auto-generated method stub
            return 50;
    }

    
    String getColor() {
            // TODO Auto-generated method stub
            return "Black";
    }
    
}

class Rabbit extends Animal{

            
    int getLifeCycleTime() {
            // TODO Auto-generated method stub
            return 10;
    }

    
    String getColor() {
            // TODO Auto-generated method stub
            return "White";
    }
    
}

public class AbstractTest1 {
public static void main(String[] args) {
    Animal a=new Elephant();
    a.describe();
    a=new Rabbit();
    a.describe();
}
}





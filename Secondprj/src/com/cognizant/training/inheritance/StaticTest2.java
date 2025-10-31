package com.cognizant.training.inheritance;

class T{
    private static int count;
    T(){
            count++;
    }
    public static int getCount() {
            return count;
    }
}

public class StaticTest2 {
    public static void main(String[] args) {
            T t1=new T();
            T t2=new T();
            T t3=new T();
            System.out.println("No of objects created:"+T.getCount());
    }

}
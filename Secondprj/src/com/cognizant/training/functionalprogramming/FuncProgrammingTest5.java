package com.cognizant.training.functionalprogramming;

@FunctionalInterface
interface I6{
        public void test();
}

@FunctionalInterface
interface I7{
        public String process();
}

public class FuncProgrammingTest5 {
public static void main(String[] args) {
        I7 i7=process(()->System.out.println("This is a test"));
        System.out.println(i7.process());
        
}


static I7 process(I6 i6) {
        i6.test();
        return ()->"This is another lambda";
        
}

}


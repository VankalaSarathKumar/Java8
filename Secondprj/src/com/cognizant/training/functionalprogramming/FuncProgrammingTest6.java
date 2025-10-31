package com.cognizant.training.functionalprogramming;

@FunctionalInterface
interface F1{
        int process(String a,String b);        
}

class Util{
         int getData(String s1,String s2){
                return s1.length()+s2.length();
        }
}
public class FuncProgrammingTest6 {
public static void main(String[] args) {
        Util u=new Util();
        F1 f1=u::getData;
        int totalLength=f1.process("hello", "world");
        System.out.println("Length:"+totalLength);
}
}

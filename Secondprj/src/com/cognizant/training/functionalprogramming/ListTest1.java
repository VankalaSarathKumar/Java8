package com.cognizant.training.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListTest1 {
public static void main(String[] args) {
        List<String> list=new ArrayList<String>();
        list.add("apple");
        list.add("orange");
        list.add("banana");
        
        /*Consumer<String> c=s->System.out.println(s);
        list.forEach(c);
        */
        Consumer<String> c=x->System.out.println(x);
        list.forEach(c);
        
         c=ListTest1::printUpperCaseFormat;
         list.forEach(c);
        
}

static void printUpperCaseFormat(String s) {
        System.out.println(s.toUpperCase());
}
}

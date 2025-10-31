package com.cognizant.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest1 {

	public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        List<String> list=Arrays.asList("apple","orange","banana","pine apple");
        Stream<String> stream1=list.stream();
        Stream<String> stream2=stream1.map(s->s.toUpperCase());
        Stream<String> stream3=stream2.map(s->s.substring(0, 2));
        stream3.forEach(System.out::println);
        stream1=list.stream();
        System.out.println("chaining");
        stream1.map(s->s.toUpperCase()).map(s->s.substring(0, 2)).forEach(System.out::println);
        System.out.println("returning length");
        stream1=list.stream();
        stream1.map(s->s.length()).forEach(System.out::println);

}

}
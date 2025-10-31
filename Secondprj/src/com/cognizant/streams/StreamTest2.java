package com.cognizant.streams;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest2 {
public static void main(String[] args) {
        List<String> list=Arrays.asList("apple","orange","banana","pine apple");
        Stream<String> stream1=list.stream();
        Predicate<String> predicate=s->s.length()>5;
        Stream<String> stream2=stream1.filter(predicate);
        stream2.forEach(System.out::println);
        
        Stream<Integer> stream3=Arrays.asList(23,55,11,12,90,45).stream();
        stream3.filter(x->x%2==0).map(x->x*3).forEach(System.out::println);
        
}
}
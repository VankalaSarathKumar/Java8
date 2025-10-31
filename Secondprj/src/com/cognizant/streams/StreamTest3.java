package com.cognizant.streams;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamTest3 {
        public static void main(String[] args) {
                Supplier<Double> supplier = () -> Math.floor(Math.random()*10);
                Stream.generate(supplier).limit(5).forEach(System.out::println);
        }
}

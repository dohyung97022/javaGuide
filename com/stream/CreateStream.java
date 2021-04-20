package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        // array -> stream

        // Stream.of
        Integer[] integers = new Integer[]{1,2,3,4,5};
        Stream<Integer> stream = Stream.of(integers);

        // Arrays.stream
        stream = Arrays.stream(integers, 1, 3);

        // collection -> stream

        // collection.stream
        Collection<Integer> list = new ArrayList<Integer>();
        stream = list.stream();

        // lambda -> steam

        // Stream.iterate
        stream = Stream.iterate(0, (n)->n+2);

        // Stream.generate
        Stream<Double> streamDouble = Stream.generate(Math::random);

        // stream.ranged
        IntStream intStream = IntStream.range(1,10);
        intStream.forEach(System.out::println);
    }
}

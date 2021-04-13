package com.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {

        // collection -> stream
        // stream
        Collection<Integer> list = new ArrayList<Integer>();
        Stream<Integer> stream = list.stream();

        // lambda -> steam
        // iterate
        // generate
        stream = Stream.iterate(0, (n)->n+2);
        Stream<Double> streamDouble = Stream.generate(Math::random);

        // array -> stream
        // Stream.of
        Integer[] integers = new Integer[]{1,2,3,4,5};
        stream = Stream.of(integers);
        // Arrays.stream
        Arrays.stream(integers, 1, 3);

        stream.forEach((System.out::println));
        // 스트림은 최종연산을 하면 스트림은 버려진다.
        // 다시 생성하고 최종연산을 하도록 한다.
        // stream.forEach((System.out::println));

        // Intstream.ranged
        IntStream intStream = IntStream.range(1,10);
        intStream.forEach(System.out::println);
    }
}

package com.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamMultiprocessing {
    public static void main(String[] args) {
        // 직렬처리
        // 1~9
        IntStream.range(1,10).sequential().forEach(System.out::println);

        // 병렬처리
        // 49385261
        // 멀티스레딩
        IntStream.range(1,10).parallel().forEach(System.out::println);
    }
}

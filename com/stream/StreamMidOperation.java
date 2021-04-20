package com.stream;

import java.util.stream.Stream;

public class StreamMidOperation {
    public static void main(String[] args) {

        // stream.skip
        // skip 은 해당 인덱스 앞의 모든 요소를 스킵한다.
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9);
        integerStream.skip(3).forEach((i)->{});

        // stream.limit
        // limit 은 해당 인덱스 이후의 요소를 무시한다.
        integerStream = Stream.of(1,2,3,4,5,6,7,8,9);
        integerStream.limit(5).forEach((i)->{});

        // stream.distinct
        // distinct 는 중복되는 요소들을 제거한다.
        integerStream = Stream.of(1,1,1,2,2,2,3,4,5);
        integerStream.distinct().forEach((i)->{});

        // stream.filter
        // filter 는 해당 람다식으로 요소를 필터한다.
        integerStream = Stream.of(1,1,1,2,2,2,3,4,5);
        integerStream.filter((i)->i>3).forEach((i)->{});

        // stream.sorted
        // sorted 는 comparator 또는 comparable 로 sort 한다.
        integerStream = Stream.of(5,6,2,1,8,2,7,3);
        integerStream.sorted().forEach((i)->{});

        // stream.map
        // map 은 stream 을 변경하는 방법이다.
        integerStream = Stream.of(5,6,2,1,8,2,7,3);
        integerStream.map((i)->i*10).forEach(System.out::println);

        // stream.flatMap
        // flatMap 은 2중 stream 을 변경하는 것이다.
    }
}

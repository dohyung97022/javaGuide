package com.stream;

import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamFinOperation {
    public static void main(String[] args) {

        // count
        // 스트림안의 요소의 갯수를 반환한다.
        System.out.println(IntStream.range(1,200).count());

        // sum
        // 스트림의 합을 반환한다.
        System.out.println(IntStream.range(1,10).sum());

        // max/min
        // 스트림의 최대 최소 값을 반환한다.
        System.out.println(IntStream.range(1,10).max());

        // forEach
        // 모든 스트림의 요소에 특정 작업 수행
        IntStream.range(1,10).parallel().forEach(System.out::println);

        // forEachOrdered
        // parallel 을 사용하면 멀티 쓰레드를 사용하여
        // 순서가 뒤바뀌지만 forEachOrdered 는 순서를 다시 맞춘다.
        IntStream.range(1,10).parallel().forEachOrdered(System.out::println);

        // allMatch
        // predicate 를 사용하여 조건을 만족시키는 경우를 본다.
        boolean bool = IntStream.range(1,10).allMatch(i->i>10);
        System.out.println(bool);

        // anyMatch
        // predicate 가 하나라도 만족시킨다면 참이다.
        bool = IntStream.range(1,10).anyMatch(i->i==5);
        System.out.println(bool);

        // noneMatch
        // predicate 가 모두 만족되지 않으면 참이다.
        bool = IntStream.range(1,10).noneMatch(i->i==3);
        System.out.println(bool);

        // findFirst
        // 스트림의 첫 요소를 반환한다. 순차 스트림에 사용된다.
        System.out.println(IntStream.range(1,10).sequential().findFirst());

        // findAny
        // 스트림의 아무거나 하나 반환한다. 병렬 스트림에 사용된다.
        System.out.println(IntStream.range(1,10).parallel().findAny());

        // toArray
        // stream 을 array 로 변경한다.
        Integer[] iArr = Stream.of(1,2,3,4,5).toArray(Integer[]::new);

        // reduce
        // 스트림의 요소를 하나씩 꺼내서 누적 연산을 한다.
        // reduce -> count
        System.out.println(IntStream.range(1,10).reduce(0,(a,b)->a+1));
        // reduce -> sum
        System.out.println(IntStream.range(1,10).reduce(0,(a,b)->a+b));
        // reduce -> max
        System.out.println(IntStream.range(1,15).reduce(Integer.MIN_VALUE,(a,b)-> a>b ? a:b));
        // reduce -> min
        System.out.println(IntStream.range(-10,10).reduce(Integer.MAX_VALUE,(a,b)->a>b? b:a));

        // collect

        // collect 의 분할법
        // partitionBy
        // 스트림을 짝수, 홀수로 분할하기, map<Boolean,List> 를 반환한다.
        System.out.println(Stream.of(1,2,3,4,5,6).collect(Collectors.partitioningBy(i->i%2==0)));
        // 분할 이후의 연산도 이어서 할 수 있다.
        System.out.println(Stream.of(1,2,3,4,5,6).collect(Collectors.partitioningBy(i->i%2==0,Collectors.counting())));
        // groupingBy
        // 앞의 2분할이 아니라 n 분할이다.
        // 키 기준 람다, 값 기준 람다로 map<Object, List> 로 주어진다.


        // collectors 의 counting
        System.out.println(Stream.of(1,2,3).collect(Collectors.counting()));
        // collectors 의 sum
        System.out.println(Stream.of("길이를","모두","sum 합니다.").collect(Collectors.summingInt((s)->s.length())));
        // collectors 의 maxBy
        System.out.println(Stream.of(1,2,3,4,5).collect(Collectors.maxBy((a,b)->a-b)));

        // collect -> list
        Stream.of("김도형","김민형","김준형").collect(Collectors.toList());
        // collect -> set
        Stream.of(1,2,3,4,5).collect(Collectors.toSet());
        // collect -> map
        // p.hashCode 를 key 로 지정한 것이고
        // p 값 그대로를 value 로 지정한 것이다.
        Stream.of("스트림을","맵으로","변환합니다.").collect(Collectors.toMap(p->p.hashCode(),p->p));


    }
}

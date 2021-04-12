package com.Functional;

import com.string.Str;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.*;

public class Functionall {
    public static void main(String[] args) {

        // runnable
        // 아무런 변수도 받지 않고 아무런 변수도 반환하지 않는다.
        Runnable runnable = ()-> System.out.println("running");
        runnable.run();

        // consumer
        // 변수만 받는다.
        Consumer<Integer> consumer = (i)-> System.out.println(i);
        consumer.accept(1);

        // supplier
        // 변수만 리턴한다.
        Supplier<Integer> supplier = () -> 10;
        System.out.println(supplier.get());

        // function
        // 변수를 받고 변수를 리턴한다.
        Function<String, Integer> function = (s) ->Integer.parseInt(s);
        System.out.println(function.apply("10"));
        // andThen 을 사용할 경우 위에 Integer 를 돌려준다면
        // Integer 를 받고 사용 할 수 있는 function 을 넣어줘야 한다.
        // function.andThen();
        // compose 는 순서가 반대되는 것일 뿐이다.
        // function.compose();

        // predicate
        // 변수를 받고 bool 을 리턴한다.
        Predicate<Integer> predicate = (i) -> i==10;
        System.out.println(predicate.test(10));
        // predicate.and();
        // predicate.or();
        // predicate.negate();

        // 이 5가지 틀 앞에 bi 를 붙이면 2개를 받을 수 있게 만들 수 있다.
        // 다만 biSupplier 는 존재하지 않는다. 리턴값이 2개일 수 없다.

       UnaryOperator<Integer> unaryOperator = (i) -> i+10;
        System.out.println(unaryOperator.apply(10));

        // collection.removeIf
        // predicate 를 사용하여 더 쉽게 사용할 수 있다.
        Collection<Integer> collection = new ArrayList<Integer>();
        collection.add(10);
        collection.add(10);
        collection.add(20);
        collection.add(100);
        collection.removeIf(v->v == 10);
        System.out.println(Arrays.toString(collection.toArray()));

        // iterable.forEach
        // unaryOperator 를 사용하여 더 쉽게 바꿀 수 있다.
        collection.forEach((i)-> System.out.print(i));
        System.out.println("");

        // list.replaceAll
        List<Integer> list = new ArrayList<Integer>(collection);
        list.replaceAll((i)->i+10);

        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"김도형");
        map.put(2,"김준형");
        map.put(3,"김민형");

        // 키 값에 작업을 수행하고 추가한다.
        map.compute(1,(i,k)->k+" 공부한다.");
        // 해당 값이 맵 안에 존재하지 않는다면 다음을 추가한다.
        map.computeIfAbsent(4,(i)->String.valueOf(i)+" 없어서 수행");
        // 해당 값이 존재한다면 다음을 수행하여 추가한다.
        map.computeIfPresent(3,(i,s)->i+s);

        map.merge(2," 군대갔다.",(x,y)->x+y);

        map.forEach((i,s)-> System.out.println(s));

    }
}

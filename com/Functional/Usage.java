package com.Functional;

import java.util.*;

public class Usage {
    public static void main(String[] args) {

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

        // map.compute
        // 키 값에 작업을 수행하고 추가한다.
        map.compute(1,(i,k)->k+" 공부한다.");

        // map.computeIfAbsent
        // 해당 값이 맵 안에 존재하지 않는다면 다음을 추가한다.
        map.computeIfAbsent(4,(i)->String.valueOf(i)+" 없어서 수행");

        // map.computeIfPresent
        // 해당 값이 존재한다면 다음을 수행하여 추가한다.
        map.computeIfPresent(3,(i,s)->i+s);

        // map.merge
        map.merge(2," 군대갔다.",(x,y)->x+y);

        // map.forEach
        map.forEach((i,s)-> System.out.println(s));
    }
}

package com.collection;

import java.util.*;

public class Collectionss {
    public static void main(String[] args) {
        // 각 자료구조를 동기화 하는 방법, Collections.synchronized...
        List<Integer> syncList = Collections.synchronizedList(new ArrayList<Integer>());
        Set<Integer> syncSet = Collections.synchronizedSet(new HashSet<Integer>());
        Map syncMap = Collections.synchronizedMap(new HashMap<>());

        // generics <Integer> 를 추가하도록 하자.
        // 최근에는 사용되지 않는다.
        // 각 자료구조에 단일한 type 만 들어오도록 하는 checked
        syncList = Collections.checkedList(new ArrayList<Integer>(),Integer.class);
        syncSet = Collections.checkedSet(new HashSet<Integer>(), Integer.class);
        syncMap = Collections.checkedMap(new HashMap<>(), Integer.class, String.class);
    }
}

package com.collection.list;

import java.util.*;

public class Listt {
    public static void main(String[] args) {
        // 리스트는 arrayList 와 linkedList 로 구분된다.

        // 선언 방법
        List<String> strings = new ArrayList<>(20);

        // 추가 방법
        strings.add("added");

        // 다른 Collection 추가 방법
        Set<String> strings1 = new HashSet<>();
        strings1.add("added2");
        strings.addAll(strings1);

        // object 의 인덱스를 찾는 방법
        strings.indexOf("added2");

        // 뒤에서부터 object 의 인덱스를 찾는 방법
        strings.lastIndexOf("added");

        // object 를 삭제하는 방법
        strings.remove("added");

        // 인덱스를 통하여 삭제하는 방법
        strings.remove(3);

        // object 를 특정 인덱스에 추가하는 방법
        strings.set(1,"added3");

        // sort 는 정렬을 하는 방법, 원하는 규칙을 장하도록 하자.
        // 규칙을 넣지 않아도 알아서 정렬한다.
        Collections.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });
    }
}

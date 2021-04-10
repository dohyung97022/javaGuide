package com.collection.iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class Iteratorr {
    public static void main(String[] args) {
        // . iterator 를 사용하여 iterator 과 연결한다.
        ArrayList<String> strings = new ArrayList<>();
        Iterator iterator = strings.iterator();

        // 다음이 존재하는지에 따라 bool 을 반납한다.
        iterator.hasNext();

        // 다음 요소를 찾는다.
        iterator.next();

        // next 로 읽어온 요소를 삭제한다.
        iterator.remove();


    }
}

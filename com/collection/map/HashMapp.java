package com.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapp {
    public static void main(String[] args) {
        // 크기 10 인 hashMap
        Map hashMap = new HashMap(10);
        // 크기 10 에 80% 에서 확장하는 hashMap
        hashMap = new HashMap(10,0.8f);
        // 해당 원소들을 복사한 hashMap
        hashMap = new HashMap(hashMap);

        // put 의 경우 map 이기에 key value 를 준다.
        hashMap.put(1,"value");

        System.out.println(hashMap);

        // contains Key / Value 를 사용하여 값이 존재하는지 확인
        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.containsValue("value"));
    }
}

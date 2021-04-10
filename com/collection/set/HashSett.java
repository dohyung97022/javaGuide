package com.collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class HashSett {
    public static void main(String[] args) {
        Set<String> stringHash = new HashSet<>();
        // 생성 방법
        stringHash = new HashSet<>(stringHash);
        stringHash = new HashSet<>(10);
        // 크기가 10 인데 0.8% 정도가 차면 2배로 확장
        stringHash = new HashSet<>(10,0.8f);


        // hashSet 은 중복을 허용하지 않고 해쉬값을 비교한다.
        // 그럼으로 add 를 할 때 equals() 와 hashCode() 를 사용한다.
        // 주의 !!!!
        // 개인적 class 를 hashSet 으로 사용할 경우 equals hashCode 를 overRide 하도록 한다.
        stringHash.add("아");


        // 순서를 원한다면 linkedHashSet 을 사용하면 된다.
        stringHash = new LinkedHashSet<>();
    }
}

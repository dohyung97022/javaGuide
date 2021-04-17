package com.map;

import java.util.HashMap;

public class Mapp {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();

        // put
        // 추가 / 맵 추가
        map.put(1,"one");

        // putAll
        map.putAll(map);

        // clear
        // 전체 삭제
        map.clear();

        // get
        // 1번 인덱스를 가져오기
        map.get(1);

        // remove
        // 특정 키 value 조합을 삭제하기
        map.remove(1);

        // size
        // map 의 모든 원소 개수 가져오기
        map.size();

        // containsKey
        // 키를 포함합니까?
        map.containsKey(1);

        // containsValue
        // value 를 포함합니까?
        map.containsValue("one");

        // keySet
        // 모든 키를 가져오기
        map.keySet();

        // values
        // 모든 value 를 가져오기
        map.values();
    }
}

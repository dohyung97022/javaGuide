package com.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class Queuee {
    public static void main(String[] args) {
        // priority que 는 필요한 부분을 먼저 저장하는 정렬된 queue 이다.

        // 뒤의 참조 변수는 java api 에서 찾아서 사용하도록 하자.
        Queue<String> stringQue = new LinkedList<>();

        // add / offer
        // 추가
        stringQue.add("test"); // exception 반환
        stringQue.offer("test");

        // remove / poll
        // 삭제
        stringQue.remove(); // exception 반환
        stringQue.poll();
    }
}

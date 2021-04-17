package com.collection.list;

import java.util.List;
import java.util.Stack;

public class Stackk {
    public static void main(String[] args) {
        // 생성자
        Stack<String> stackList = new Stack<>();

        // push / peek / pop
        // c++ 의 stack 이 그렇듯 push pop peak 가 있다.
        stackList.push("stack1");
        stackList.peek();
        stackList.pop();

        // search
        // search 는 해당 원소를 찾는다.
        stackList.search("stack1");

        // empty
        // stack 이 비었는지 알려준다.
        stackList.empty();
    }
}

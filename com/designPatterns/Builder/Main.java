package com.designPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        // builder method는 constructor가 모든 변수를 받을 수 없거나
        // 변수를 지정할 수도, 지정하지 않을 수도 있을 경우 사용하기에 용이하다.
        Account account = new AccountBuilder().setAge(25).setGender("male").setName("Kim").build();
    }
}

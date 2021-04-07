package com.string;

public class Str {
    public static void main(String[] args) {
        // empty string 의 초기화
        String str = "";
        String str2 = null;

        // String 은 보통 constant pool 안에서 빼오기 때문에
        // new 로 지정하지 않으면 같은 pool 에서 사용하여
        // == 가 같은 값이 된다.
        String str3 = "abc";
        String str4 = "abc";
        // true
        System.out.println(str3.equals(str4));

        str3 = new String("abc");
        str4 = new String("abc");

        // false
        System.out.println(str3.equals(str4));

        // 절대로 new 를 사용하여 string 을 만들지 말자.
        // memory 의 낭비이다.
    }
}

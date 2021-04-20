package com.variable;

public class Hash {
    public static void main(String[] args) {
        // .hashCode
        // hash code 란 객체의 주소를 가져오는 방법이다.
        String str1 = new String("ABC");
        String str2 = new String("ABC");
        System.out.println(str1.hashCode());

        // string const pool
        // string 은 const pool 에서 나오기에
        // 같은 주소를 사용한다.
        // 그래서 equals 가 true 이고 hashCode 가 같다.
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        // System.identityHashCode 는 객체마다의 주소를 갖고 있다.
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}

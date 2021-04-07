package com.variable;

public class Hash {
    public static void main(String[] args) {
        // hash code 란 객체의 주소를 가져오는 방법이다.
        String str1 = new String("ABC");
        String str2 = new String("ABC");

        // equals 를 오버라이딩하면 hashCode 또한 오버라이딩해야 한다.
        System.out.println(str1.equals(str2));
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        // System.identityHashCode 는 객체마다의 주소를 갖고 있다.
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
    }
}

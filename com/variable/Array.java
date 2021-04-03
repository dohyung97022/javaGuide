package com.variable;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        // Int Array
        // 값이 저장되면 기본적으로 0으로 초기화된다.
        int[] intArray = new int[5];
        for (int intVal : intArray) {
            System.out.println(intVal);
        }

        // 이렇게 바로 값을 지정해줄 수 있다.
        intArray = new int[]{1,2,3,4,5};

        // constructor를 생략할 수도 있다.
        int[] intArray2 = {1,2,3,4,5};

        // [I@ (array, integer, 주소)
        System.out.println(intArray2);

        // Arrays.toString 으로 출력하도록 하자.
        System.out.println(Arrays.toString(intArray2));

        // Char Array
        // char array는 예외적으로 abc를 출력한다.
        char[] charArr = {'a','b','c'};
        System.out.println(charArr);

        // String Array
        // str array의 초기값은 null이다.
        String[] strArr = new String[3];
        System.out.println(Arrays.toString(strArr));
    }
}

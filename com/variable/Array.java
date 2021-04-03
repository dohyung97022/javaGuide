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

        // 차원 배열
        int[][] str2DArr = {
                {3,3,3},
                {1,1,1},
                {2,2,2}
        };
        // 다음과 같은 방식으로 출력할 수 있다.
        for (int[] innrArry :str2DArr) {
            System.out.println(Arrays.toString(innrArry));
        }
        // deep to string으로도 2차원 배열을 출력할 수 있다.
        System.out.println(Arrays.deepToString(str2DArr));

        // equals를 사용하여 비교가 가능하다. ==는 사용할 수 없다.
        System.out.println(Arrays.equals(intArray,intArray2));
        // 2차원 배열과 같은 경우는 deepEquals로 사용한다.
        System.out.println(Arrays.deepEquals(str2DArr,str2DArr));

        // array copyOf 또는 copyOfRange 가 존재한다.
        int[] copyArr = {1,2,3,4,5};
        int[] toArr = Arrays.copyOf(copyArr, copyArr.length);
        toArr = Arrays.copyOf(copyArr, 3);
        toArr = Arrays.copyOfRange(copyArr,0,copyArr.length);

        // array 정렬은 arrays.sort()를 사용한다.
        Arrays.sort(intArray);
    }
}

package com.collection.arrays;

import com.variable.Array;

import java.util.Arrays;
import java.util.List;

public class Arrayss {
    public static void main(String[] args) {
        String[] strings = {"가","나","다","라"};

        // array [] 를 쉽게 출력하게 해준다.
        System.out.println(Arrays.toString(strings));
        System.out.println(strings.toString());
        // deepToString 은 다차원 배열을 편하게 한다.
        String[][] strings2D = {{"가","나","다"},{"마","바","사"}};
        System.out.println(Arrays.deepToString(strings2D));

        // copy 를 하여 앞에서부터 자르거나 복사를 용이하게 해준다.
        String[] strings1 = Arrays.copyOf(strings,3);
        System.out.println(Arrays.toString(strings1));

        // copyOfRange 는 지정된 range 를 자른다.
        strings1 = Arrays.copyOfRange(strings, 1,3);
        System.out.println(Arrays.toString(strings1));

        // 비교를 위한 equals
        Arrays.equals(strings,strings1);
        // 다차원 배열의 비교를 위한 deep equals
        Arrays.deepEquals(strings,strings1);

        // List 로 변경하기
        List newList = Arrays.asList(strings);

        // binary search 또한 할 수 있다.
        // 반드시 sort 를 먼저 하고 binary search 하도록 하자.
        int[] ints = {3,4,62,3,6,8,1};
        int i = Arrays.binarySearch(ints, 3);
        System.out.println(i);

        // sort 이후
        Arrays.sort(ints);
        System.out.println(Arrays.binarySearch(ints,3));
    }
}

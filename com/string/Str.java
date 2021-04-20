package com.string;

import java.util.Arrays;

public class Str {
    public static void main(String[] args) {
        // empty string / null
        // empty string 의 초기화
        // 각각 다르다.
        String str = "";
        String str2 = null;


        // constant pool
        // String 은 보통 constant pool 안에서 빼오기 때문에
        // new 로 지정하지 않으면 같은 pool 에서 사용하여
        // == 가 같은 값이 된다.
        String str3 = "abc";
        String str4 = "abc";
        // true
        System.out.println(str3.equals(str4));

        // 다음은 같은 pool 안에서 생성되지 않았기에 다르다.
        str3 = new String("abc");
        str4 = new String("abc");
        // false
        System.out.println(str3.equals(str4));
        // 절대로 new 를 사용하여 string 을 만들지 말자.
        // memory 의 낭비이다.

        // string.compareTo
        str3 = "aaa";
        str4 = "bbb";
        // compareTo 는 제일 앞자리에서부터 순서대로 비교한다.
        System.out.println(str3.compareTo(str4));

        // string.concat
        // concat 은 두 str 을 조합한다.
        str3 = str3.concat(str4);
        System.out.println(str3);

        // string.contains
        // contains 는 charSequence 라는 interface 를 받는다.
        // 이 interface 는 다형성을 이용하여
        // charBuffer Segment String StringBuffer StringBuilder
        // 가 들어올 수 있다.
        StringBuffer stringBuffer = new StringBuffer(10);
        str3.contains(stringBuffer);

        // string.endsWith
        str3 = "a is for apple";
        str4 = "apple";
        // 해당 string 으로 끝나는지 확인
        System.out.println(str3.endsWith(str4));

        // string.indexOf
        str3 = "abcdefg";
        // 해당 문자의 위치를 인덱스로 반환
        System.out.println(str3.indexOf('b'));
        // 해당 문자열의 위치를 인덱스로 반환
        System.out.println(str3.indexOf("defg"));
        // 해당 인덱스 이후의 문자의 위치를 인덱스로 반환
        System.out.println(str3.indexOf('e',5));

        // string.lastIndexOf
        // indexOf 와 lastIndexOf 의 차이는?
        // lastIndexOf 는 뒤에서부터 인덱스를 찾는다는 점이 다르다.
        str3 = "abc/defghi/abc";
        System.out.println(str3.lastIndexOf('.'));
        System.out.println(str3.indexOf('.'));

        // string.split
        // split 은 해당 char 이나 문자로 나눈다.
        String[] strArr = str3.split("/");
        System.out.println(Arrays.toString(strArr));

        // string.join
        // join 은 중간에 해당 문자로 구분하며 arr 를 문자열로 만들어준다.
        System.out.println(String.join("+",strArr));

        // string.substring
        // substring 은 문자열을 특정 인덱스 사이로 자르는 것이다.
        System.out.println(str3.substring(3,5));

        // string.trim
        // trim 은 앞과 뒤의 공백을 없애준다. 다만 중간의 공백은 없어지지 않는다.
        str3 = "    a b c      ";
        System.out.println(str3.trim());

        // string.valueOf
        // 빈 문자열을 더하는 것으로 문자열을 만들 수 있지만 + ""
        // String.valueOf(); 를 통하여 문자열로 바꾸는 것이 더 빠르다.
        System.out.println(String.valueOf(5));

    }
}

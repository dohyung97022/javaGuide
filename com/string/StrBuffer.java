package com.string;

public class StrBuffer {
    public static void main(String[] args) {
        // Create
        // 생성자
        // string 을 넣어준다면 해당 str 의 크기에 맞게 array 를 만들고 내용을 복제한다.
        StringBuffer sb = new StringBuffer("abcdef");
        // 숫자를 지정해주는 경우 해당 길이의 stringBuffer 를 만든다.
        sb = new StringBuffer(10);

        // stringBuffer.equals
        // string 과 stringBuffer 의 equals 는 다르다.
        // string 의 equals 는 내용의 비교이지만
        // stringBuffer 의 equals 는 주소의 비교이다.
        StringBuffer sb2 = new StringBuffer("abc");
        StringBuffer sb3 = new StringBuffer("abc");
        System.out.println(sb2.equals(sb3)); // -> false (주소의 비교이다.)

        // string buffer 의 내용을 비교하고자 한다면 toString 을 사용하여 비교하도록 하자.
        System.out.println(sb2.toString().equals(sb3.toString()));

        // stringBuffer.append
        // append 는 끝에 추가한다.
        sb.append(10).append('c').append("abc");

        // stringBuffer.insert
        // insert 는 offset 이후에 추가한다.
        sb.insert(4, true).insert(5,5.00f);

        // stringBuffer.capacity
        // capacity 는 버퍼의 크기를 반환한다.
        sb.capacity();

        // stringBuffer.length
        // length 는 문자열의 길이를 반환한다.
        sb.length();

        // stringBuffer.setLength
        // length 를 변경한다. 짤린 부분은 사라진다. 추가되면 공백 문자가 추가된다.
        sb.setLength(100);

        // stringBuffer.reverse
        // reverse 는 문자열을 꺼꾸로 변경시킨다.
        sb.reverse();

        // stringBuffer.setCharAt
        // setCharAt 는 해당 인덱스의 문자를 변경한다.
        sb.setCharAt(10,'b');

        // stringBuffer.substring
        // substring 은 짤라내는 것인데 String type 를 반환한다.
        sb.substring(50);
        sb.substring(10,100);

        // stringBuffer.toString
        // 다시 string 으로 변경하고 싶다면
        sb.toString();
    }
}

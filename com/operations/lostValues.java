package com.operations;

public class lostValues {
    public static void main(String[] args) {
        // 더 큰 type의 값을 더 작은 type의 값에
        // 초과해서 넣으면 나머지 값들이 overflow되어
        // 값손실이 일어난다.
        int i = 300;
        byte b = (byte)i;
        System.out.println(b);
    }
}

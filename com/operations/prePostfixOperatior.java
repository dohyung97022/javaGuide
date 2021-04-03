package com.operations;

public class prePostfixOperatior {
    public static void main(String[] args) {
        // 먼저 더한 이후 저장한다.
        int a = 0;
        int a1 = 0;
        a = ++a1;
        System.out.println(a);
        System.out.println(a1);

        // 참조/저장한 이후 더한다.
        int b = 0;
        int b1 = 0;
        b = b1++;
        System.out.println(b);
        System.out.println(b1);

        // 혼자 쓰인 전위/후위형은 차이가 없다.
        ++a;
        a++;
        // 같다.
    }
}

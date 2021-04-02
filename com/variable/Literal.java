package com.variable;

public class Literal {
    public static void main(String[] args) {
        // 논리형
        boolean boolType = true;
        boolType = false;

        // 문자형에 '\n'도 포함된다.
        char nextLine = '\n';

        // 정수형
        // 그냥 숫자는 10진수
        int intType = 123;
       // 0b이 앞에 붙으면 2진수
        intType = 0b0101;
        // 0이 앞에 붙으면 8진수
        intType = 0123;
        // 0x가 앞에 붙으면 16진수
        intType = 0x123;
        // L이 뒤에 붙으면 Long Type
        long longType = 100L;
        // _를 넢어 자릿수를 보기 쉽게
        long snakeLong = 10_000_000_000L;

        // 실수형
        // 실수형은 기본적으로 double이다.
        double doubleType = 3.14;
        // float는 f literal을 추가한다.
        float floatType = 3.14f;
        // 소수점 뒤의 자리를 생략할 수 있다.
        doubleType = 100.;
        // 소수점 앞의 자리를 생략할 수 있다.
        doubleType = .1592;
    }
}

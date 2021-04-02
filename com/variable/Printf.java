package com.variable;

public class Printf {
    public static void main(String[] args) {
        // %b 논리형
        System.out.printf("%b \n", false);
        // %d 10진수
        System.out.printf("%d \n", 100);
        // %o 8진수
        System.out.printf("%o \n", 31524);
        // %x 16진수
        System.out.printf("%x \n", 591285);
        // %f float
        System.out.printf("%f \n",3.33);
        // %e 지수
        System.out.printf("%e \n", 0e10);
        // %c 문자
        System.out.printf("%c \n", 'c');
        // %s 문자열
        System.out.printf("%s \n", "string");

        // % 앞에 #을 붙이면 접두사가 표시된다.
        System.out.printf("%#o \n" , 15); // -> 017
        System.out.printf("%#x \n",15); // -> 0xf

        // printf는 반드시 \n을 포함시키도록 하자.

        // 지시자 앞에 숫자를 붙여주는 것으로 출력 앞 공백을 지정할 수 있다.
        System.out.printf("[%5d]\n", 10);
        System.out.printf("[%-5d]\n",10);
        // 지시자 앞에 0을 붙이면 남는 자리에 0을 추가한다.
        System.out.printf("[%05d]\n",10);
        // 다만 자릿수가 넘어가면 다 출력된다.
        System.out.printf("[%-5d]\n",100000000);
        // 지시자 앞에 .숫자를 놓으면 총 출력 자릿수를 지정할 수 있다.
        System.out.printf("[%.3s]\n","testing print");
    }
}

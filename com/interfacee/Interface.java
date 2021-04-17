package com.interfacee;


interface Interface {

    // public static final variable
    // interface 의 특징
    // var 의 public static final 은 무조건이다. 생략 가능하다.
    int finalInt = 3;

    // public abstract function
    // public abstract 은 무조건이다. 생략 가능하다.
    void absFunction();

    // default function
    // 디폴트 메서드는 내용이 구현되어 있는 method 이다. (jdk1.8)
    // 상속받은 class 에서 반드시 구현되지 않아도 된다.
    // 인터페이스의 디폴트 메서드 간의 충돌이 가능하다.
    // 부모의 메서드 충돌은 부모의 function 을 우선시한다.
    default void defFunction(){};
}

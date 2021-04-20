package com.variable;

public class modifier {
    // 접근 제어자

    // default
    // 같은 패키지 내에서만 접근 가능
    int di;

    // public
    public int pi;

    // protected
    // 같은 클래스, 자손 클래스 내에서만 접근 가능
    protected int pri;

    // private
    // 클래스 내에서만 접근 가능
    private int prii;

    // abstract
    // abstract int ai;

    // native
    // os 내의 function 들
    // native int ni;

    // transient
    // serialization 을 하지 않는 var
    transient static int ti = 100;

    // synchronized
    // threading 의 synchronized method 확인
    // synchronized void thread1();

    // volatile
    // 메모리에서 바로 읽고 쓰는 변수
    // 멀티쓰레드에서 변수의 지속성을 위해 사용
    volatile int vi;

    // final
    // 변하지 않는 변수
}

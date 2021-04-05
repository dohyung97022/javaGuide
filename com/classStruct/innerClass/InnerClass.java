package com.classStruct.innerClass;

public class InnerClass {
    public int i= 100;
    /* 내부 클래스는 특정 클래스가 항상
    어떠한 클래스 안에서 사용될 것이라고 보이면
    사용할 수 있다.
    */
    class Inner{
        void method(){
            // 내부 클래스는 외부 클래스의 변수를 바로 사용 가능
            System.out.println(i);
        }
    }
    // iv cv lv 로 inner class 를 설명할 수 있다.
    // 특징들이 같다.
}

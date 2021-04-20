package com.object;

public class Methods {
    public static void main(String[] args) {
        // g - fetch - nw

        // Object class 는 모든 class 의 조상이다.
        Object object = new Object();

        // object.getClass
        // 클래스에 대한 정보와 method 들을 반환한다.
        object.getClass();

        // finalize 는 protected 되어 있다.
        // garbage collector 에서 해당 객체를 치우라는 예기이다.
        // object.finalize();

        // object.equals
        // 같은지 확인
        object.equals(object);

        // object.toString
        // toString 은 class@주소 형태로 되어있어
        // iv 를 표시하도록 보통 overriding 된다.
        object.toString();

        // object.clone
        // clone 은 protected 되어 있다.
        // 같은 객체를 만드는 방법이다.
        // object.clone();

        // object.hashCode
        // hashCode 는 해당 객체의 hashCode 를 반환하는 방법이다.
        object.hashCode();

        // object.notify
        // thread 관련 함수이다.
        object.notify();

        // object.notifyAll
        object.notifyAll();

        // objects.wait
        // thread 관련 함수이다.
        // object.wait();
    }
}

package com.javaFundementals;

// child는 parent class를 1개 이상 가질 수 없다. 그럼으로 interface를 사용하자.

// public class Whatever implements Interface, Interface2 (여러개도 가능!!!)
interface Interface {
    int i = 3;
    // interface 에서 지정되는 모든 변수는 public static final 이다.
    public static final int z = 3;

    // public void Interface()는 안된다. constructor도 안된다.

    // 모든 interface는 해당 정의를 해주는 것이다.
    // 값이나 기능을 하면 안된다.
    public void draw();
}

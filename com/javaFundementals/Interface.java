package com.javaFundementals;

// child는 parent class를 1개 이상 가질 수 없다. 그럼으로 interface를 사용하자.

// public class Whatever implements Interface, Interface2 (여러개도 가능!!!)
interface Interface {
    // int i = 3 은 안된다. interface는 parameter를 가질 수 없다.

    // public void Interface()는 안된다. constructor도 안된다.

    // 모든 interface는 해당 정의를 해주는 것이다.
    // 값이나 기능을 하면 안된다.
    public void draw();
}

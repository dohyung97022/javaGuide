package com.classStruct.anonymousClass;

public class AnonymousClass {
    public static void main(String[] args) {
        // 사용이 빈번하지 않고 1회용인 class를 지정하면
        // 낭비가 되니까 그때 바로 지정하고 사용하기 위한 class

        // 보통 부모의 class를 받고 중괄호 안에서 바로 정의한다.
        Object ac = new Object(){ void method(){}};
    }
}

package com.variable;

public class referenceVariable {
    static class Type{
        int x;

        public Type() {
        }
    }

    public static void main(String[] args) {
        // 타입이 지정되는 경우는 참조형 매개변수이다.
        Type t = new Type();
        t.x = 100;
        System.out.println(t.x);

        // 참조형 매개변수는 변경이 적용된다.
        changeByType(t);
        System.out.println(t.x);

        // 기본형 매개변수는 변경이 적용되지 않는다. (포인터가 아니다)
        changeByInt(t.x);
        System.out.println(t.x);
    }

    static void changeByType(Type t){
        t.x = 1000;
    }

    static void changeByInt(int i){
        i = 2000;
    }
}

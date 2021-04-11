package com.annotation;

import java.util.ArrayList;

public class Annotation {
    static class Parent{
        public void parentMethod(){

        }
    }
    static class Child extends Parent{
        // 오버라이딩을 할 때 왜 이 annotation 을 붙여야 할까?
        // 만일 method 가 잘못 typing 되었을 경우 그것을 인지 못할 수도 있기 때문이다.
        @Override
        public void parentMethod() {
            super.parentMethod();
        }

        // javadoc 안에서 deprecated 이라고 나오며
        // 삭제하지 않고 deprecated 를 사용하는 이유는
        // 이 코드가 사용된 곳에서 수정이 되지 않아 문제가 발생하는
        // 경우를 방지하기 위해서이다.
        @Deprecated
        public void deprecatedMethod(){
            return;
        }

        public Child() {
        }
    }
    public static void main(String[] args) {
        Child child = new Child();

        // intellij 나 이클립스에서는 오류가 나지 않지만
        // cmd 를 통해 javac 를 하면 나온다.
        child.deprecatedMethod();

        // 해당 annotation 은 경고의 발생을 억제한다.
        // 경고를 확인했으니 suppress 하라는 의미이다.
        @SuppressWarnings("unchecked")
        ArrayList list = new ArrayList();
        list.add(new Object());
    }

    @FunctionalInterface
    interface Functional {

        // functionalInterface 는 한개의 추상 클래스만을 표시해야 하고
        // 이 에노테이션을 사용하여 그렇게 작성했는지 확인할 수 있다.
        void function();
    }
}

package com.exception;

public class MethodExceptions {
        public static void main(String[] args) {
        method();
    }
    // method 는 throws 를 통하여 exception 들을 지정할 수 있다.
    static void method() throws ArithmeticException, ClassCastException{
        return;
    }
}

package com.lambda;

public class Lambda {

    public static void main(String[] args) {
        // 람다식을 지정하고 functionalInterface 를 사용하여 호출할 수 있다.
        FunctionalInterface1 functionalInterface = (a,b) -> a > b ? a : b;
        System.out.println(functionalInterface.max(5,10));
    }

    // 다음과 같이 function 안에 람다식을 받아서 사용할 수 있다.
    public void lambdaFunction(FunctionalInterface1 functionalInterface1){
        functionalInterface1.max(10,20);
    }
}

// 람다식을 객체로 지정하는 방법이다.
// functionalInterface 을 정의하고 지정하도록 하자.
@FunctionalInterface
interface FunctionalInterface1{
    int max(int a, int b);
}

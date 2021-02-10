package com.javaFundementals;

public class SOLID {
    // https://www.youtube.com/watch?v=-ptMtJAdj40

    // Single Responsibility Principle
    // 이건 oop 기본!

    // Open/Closed Principle
    // open for extension but closed for modification
    // 이 의미는... 다른 것을 확장적으로 더 추가할 수 있어야 할 때
    // 코드를 바꿀 필요는 없게끔 만들라는 의미이다.

    // Liskov Substitution Principle
    // 모든 parent class에서 실행되는 코드는 모든 child class에서 실행 가능해야 한다.

    // Interface Segregation Principle
    // 인터페이스가 이용될 때에는 사용하지도 않는 function들이 있으면
    // 인터페이스를 나누는 것을 고려해보자.

    // Dependency Inversion Principle
    // store -> payment(인터페이스)
    // payment <- stripe api
    // payment <- paypal api
}

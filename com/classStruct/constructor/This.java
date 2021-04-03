package com.classStruct.constructor;

public class This {
    String name;
    String definition;
    int age;

    // this는 생성자로도 사용할 수 있다.
    // 주로 생성자 안에서 더 상위의 생성자를 사용하기 위해 쓴다.
    public This(String name) {
        this(name,"definition");
    }

    public This(String name, String definition) {
        this(name,definition,10);
    }

    // 참조변수 this
    // this.name(지역변수) = name(참조변수);
    // 주로 지역변수와 참조변수를 구분하는데 사용된다.
    public This(String name, String definition, int age) {
        this.name = name;
        this.definition = definition;
        this.age = age;
    }

    // 참조변수 this는 인스턴스 메서드에서 사용 가능하다.
}

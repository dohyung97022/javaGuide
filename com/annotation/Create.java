package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

public class Create {
    // target 으로 위치를 지정하고
    @Target(ElementType.TYPE)
    @interface MyAnnotation{
        // 필요한 parameter 를 지정하도록 한다.
        String myParam();
        // default 가 있는 경우 생략도 가능하다.
        int myInt() default 10;
    }

    // 생성
    // myInt 는 생략되었다.
    @MyAnnotation(myParam = "this")
    public class MyClass{

    }
}

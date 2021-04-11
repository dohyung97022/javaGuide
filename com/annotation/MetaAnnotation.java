package com.annotation;

import java.lang.annotation.*;

public class MetaAnnotation {
    // 메타 에노테이션은 에노테이션을 어떻게
    // 만드는지를 지정해주는 방법이다.

    // dirt

    // javadoc 으로 작성한 문서에 포함시키는 방법
    @Documented
    public @interface A{}

    // 이 annotation 을 사용한 부모를 extend 한다면 자손 클래스
    // 또한 이 annotation 을 사용한 것 같은 효과가 난다.
    @Inherited
    public @interface B{}

    // 클래스 파일에 존재한다.
    // 실행시에 사용 가능하다.
    @Retention(RetentionPolicy.RUNTIME)
    public @interface C{}
    // 클래스 파일에서만 존재하게 한다.
    // 실행시에는 사용 불가하다.
    // 기본값이다.
    @Retention(RetentionPolicy.CLASS)
    public @interface D{}
    // 소스 파일에서만 존재하게 한다.
    @Retention(RetentionPolicy.SOURCE)
    public @interface E{}

    // 여러개를 추가적으로 한 곳에 놓을 수 있는 annotation 을 의미
    // @Repeatable(Rep.class)
    public @interface Rep{}

    // annotation 이 어디에 쓰여야 할지를 지정해주는 방법
    @Target({
            // 클래스, 인터페이스
            ElementType.TYPE,
            // 멤버 변수, enum
            ElementType.FIELD,
            // 함수
            ElementType.METHOD,
            // 함수의 파라메터
            ElementType.PARAMETER,
            // 생성자
            ElementType.CONSTRUCTOR,
            // 지역변수
            ElementType.LOCAL_VARIABLE
            // 등 더 있다.
    })
    public @interface MyAnnotation{}

    public static void main(String[] args) {

    }
}

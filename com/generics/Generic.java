package com.generics;

import java.util.ArrayList;

public class Generic{
    public class A{

    }

    public class B{

    }

    public class GenericClass <T extends A> {

        // 스태틱 멤버에게 지네릭 variable 을 줄 수 없다.
        // static T t;

        // 다만 아닌 경우에는 사용할 수 있다.
        private T t;

        // function 안에도 쉽게 사용할 수 있다.
        public T method(T t){
            return t;
        }
    }

    public class Products{

    }
    public class Tv extends Products{

    }
    public class Radio extends Products{

    }

    // generic method 가 받는 T 는 리턴값 parameter 로도 지정이 가능하다.
    public <T> T genenricMethod(T t){
        return t;
    }

    public void main(String[] args) {
        GenericClass<A> aGenericClass = new GenericClass<>();

        // ? extends Product 는 해당 product 의 모든 자식들을 사용 가능하다는 에기이다.
        ArrayList<? extends Products> list = new ArrayList<Tv>();
        ArrayList<? extends Products> Radios = new ArrayList<Radio>();

        // ? super Tv 는 Tv 와 Products  까지 포함된다.
        // Tv의 모든 조상들이 가능하다는 예기이다.
        ArrayList<? super Tv> tvList = new ArrayList<Products>();
    }
}
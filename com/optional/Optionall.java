package com.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Optionall {
    public static void main(String[] args) throws Exception {

        // optional = null 로 하지 말고 .empty 를 사용하자.
        Optional<String> optional = Optional.empty();

        // 값을 optional 안에 넣으려면 of 를 사용하자.
        optional = Optional.of("whatever");

        // 값 가져오기
        optional.get();

        // 값이 존재하지 않는다면 다른 값을 반환
        optional.orElse("반환");

        // 값이 존재하지 않는다면 람다식을 반환
        optional.orElseGet(()->"람다식");

        // 값이 존재하지 않는다면 exception 을 throw
        optional.orElseThrow(()->new Exception("exception!!"));
    }
}

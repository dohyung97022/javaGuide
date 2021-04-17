package com.math;

public class Mathh {
    public static void main(String[] args) {

        // min
        // min 은 두 수의 대소를 비교하는 방법이다.
        System.out.println(Math.min(10,100));

        // max
        // max 또한 두수를 대소비교하는 방법이다.
        System.out.println(Math.max(10,100));

        // random
        // 0과 1 사이의 double 값, 1은 반환하지 않는다. 1 미만.
        System.out.println(Math.random());

        // round
        // 반올림
        double pi = 3.841592;
        System.out.println(Math.round(pi));

        // abs
        // 절대값
        System.out.println(Math.abs(pi));

        // floor
        // 내림
        System.out.println(Math.floor(pi));

        // ceil
        // 올림
        System.out.println(Math.ceil(pi));
    }
}

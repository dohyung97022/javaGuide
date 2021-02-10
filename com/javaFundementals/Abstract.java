package com.javaFundementals;

// abstract class란 child class들이 어떤 function을 가져야 하는지 정의해준다.
abstract class Abstract {
    // child class들은 absFunc의 function들을 가져야 한다.
    public abstract void absFunc();

    // abstract class는 public functions도 가능하다.
    public void whoAreYou() {
        Log.logger.info("I am abstract!");
    }
}

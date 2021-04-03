package com.variable;

public class variableInitialization {
    // instance variable은 자동으로 0으로 초기화된다.
    int x;
    int y = x;

    // local variable은 자동으로 초기화되지 않는다.
    void mehtod(){
//        int i;
//        int j=i; // error
    }
}

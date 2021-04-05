package com.classStruct.arrayOfDifferentClass;

public class Child1 extends Parent{
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}

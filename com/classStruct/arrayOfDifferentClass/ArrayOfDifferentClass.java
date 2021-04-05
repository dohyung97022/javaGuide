package com.classStruct.arrayOfDifferentClass;

public class ArrayOfDifferentClass {
    public static void main(String[] args) {
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();
        Child3 child3 = new Child3();

        Parent[] parents = {child1, child2, child3};

        for (Parent child:parents) System.out.println(child.toString());
    }
}

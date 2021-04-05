package com.classStruct.casting;

public class InstanceOf {
    public static void main(String[] args) {


    }
    public void parentWork(Parent p){
        if (p instanceof Child)
            System.out.println("p is the instance of Child");
    }
    public void childWork(Child c){
        if (c instanceof Parent)
            System.out.println("c is always the instance of Parent");
    }
}

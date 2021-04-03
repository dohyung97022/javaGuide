package com.classStruct;

class PolyParent{
    public void func1(){
        return;
    }
    public void func2(){
        return;
    }
}
class PolyChild extends PolyParent{
    public void finc3(){
        return;
    }
    public void func4(){
        return;
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        // 조상으로 자식을 받을 수 있다.
        PolyParent poly = new PolyChild();

        // 조상으로 자식을 받을 경우 조상의 function들만 사용이 가능하다.
        poly.func1();
        poly.func2();
        //poly.func3();
    }
}

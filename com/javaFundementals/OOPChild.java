package com.javaFundementals;

public class OOPChild extends OOP {
    // 자식 class는 부모의 parameter를 상속하지만
    // 자기 자신의 parameter 또한 존재한다.
    private int oopChildInt = 3;
    private boolean ledScreen = true;

    // child 의 선언은 OOP(부모타입) oopChild1 = new OOPChild((자식선언) 으로 합니다.
    public OOPChild(String name, String color, String model, String company, int oopChildInt) {
        // super란 앞의 extends된 parent class에 전달한다는 것이다. (private도 전달한다)
        super(name, color, model, company);
        this.oopChildInt = oopChildInt;
        // super로 parent의 public method, parameter를 받거나 변경할 수 있다.
        super.getName();
    }

    // polymorphysm 이란 자식이 부모의 function을 overriding한다는 뜻입니다.
    public String getPolymorphysm() {
        return "this is the parent";
    }
}
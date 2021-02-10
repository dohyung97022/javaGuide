package com.javaFundementals;

// https://www.youtube.com/watch?v=T60YnN_Zmn8
// class studies for oop in java
public class OOP {

    // oop의 변수들은 private로 만들어
    // getter 과 setter를 지정하는 것이 좋다.
    private String name = "";
    private String color = "";
    private String model = "";
    private String company = "";
    private String engine = "800";

    // static은 모든 동일 class의 객체에서 동일하게 나온다.
    public static int count = 0;

    // static은 객체화와 관계없이 class 자체의 것을 의미한다.
    public static String getVehicle() {
        return "you have set the name and clolor of that vehicle";
    }

    // 기본 constructor
    public OOP() {
        count++;
    }

    // constructor overloading
    // constructor를 2번 정의하여 주어지는 parameter에 따라 각각 다르게 정의할 수 있는 방법이다.
    public OOP(String name, String color, String model, String company) {
        this.name = name;
        this.color = color;
        this.model = model;
        this.company = company;
        count++;
    }

    // constructor 응용
    // public AWS() {
    // this(null);
    // }

    // public AWS(String country) {
    // this(country, null);
    // }

    // public AWS(String country, String accountName) {
    // if (country != null)
    // this.country = country;
    // if (accountName != null)
    // this.accountName = accountName;
    // }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return this.name;
    }

    public String getColor() {
        return this.color;
    }

    public String getModel() {
        return this.model;
    }

    public String getCompany() {
        return this.company;
    }

    public String getEngine() {
        return this.engine;
    }

    // polymorphysm 이란 자식이 부모의 function을 overriding한다는 뜻입니다.
    public String getPolymorphysm() {
        return "this is the parent";
    }

    public int getSpeed() {
        if (getEngine() == "800") {
            return 70;
        }
        return -1;
    }

}
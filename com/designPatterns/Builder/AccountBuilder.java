package com.designPatterns.Builder;

public class AccountBuilder {
    private String name;
    private int age;
    private String gender;

    public AccountBuilder() {
        this.name = null;
        this.age = 0;
        this.gender = null;
    }

    public AccountBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public AccountBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public AccountBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public Account build() {
        return new Account(this.name, this.age, this.gender);
    }
}

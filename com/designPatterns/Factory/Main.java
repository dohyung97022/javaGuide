package com.designPatterns.Factory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ToyFactory();
        Product product = factory.create();
        product.use();
    }
}

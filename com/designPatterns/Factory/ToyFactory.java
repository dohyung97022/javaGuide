package com.designPatterns.Factory;

public class ToyFactory implements Factory {
    public Product create() {
        return new ToyProduct();
    }
}

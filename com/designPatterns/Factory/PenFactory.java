package com.designPatterns.Factory;

public class PenFactory implements Factory {
    public Product create() {
        return new PenProduct();
    }
}

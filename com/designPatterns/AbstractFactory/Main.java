package com.designPatterns.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        // 여기의 getFactory를 true또는 false로 하는 것에 따라 결과가 다르다.
        AbstractFactory shapeFactory = FactoryProducer.getFactory(true);
        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}

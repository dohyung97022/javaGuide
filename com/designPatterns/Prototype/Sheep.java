package com.designPatterns.Prototype;

public class Sheep implements Animal {

    public Sheep() {
        System.out.println("Sheep is made");
    }

    public Animal makeCopy() {
        System.out.println("Sheep is being copied");
        Sheep sheepClone = null;
        try {
            sheepClone = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheepClone;
    }
}

package com.designPatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        CloneFactory animalFactory = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep cloneSally = (Sheep) animalFactory.getClone(sally);
    }
}

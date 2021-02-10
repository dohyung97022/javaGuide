package com.designPatterns.Prototype;

public class CloneFactory {
    public Animal getClone(Animal animalSample) {
        return animalSample.makeCopy();
    }
}
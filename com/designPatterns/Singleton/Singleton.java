package com.designPatterns.Singleton;

public class Singleton {
    private static Singleton singleton = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        // lazy initialization
        // single thread 의 경우
        if (singleton == null)
            singleton = new Singleton();

        // multi thread 의 경우
        if (singleton == null)
            synchronized (Singleton.class) {
                singleton = new Singleton();
            }
        return singleton;
    }
}

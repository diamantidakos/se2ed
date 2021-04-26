package com.mgiandia.se2ed.ch13.p02singleton;

public class Singleton {
    private static Singleton instance = null;
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            System.out.println("Creating singleton");
        }
        return instance;
    }
}

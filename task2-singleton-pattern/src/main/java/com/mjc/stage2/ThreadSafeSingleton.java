package com.mjc.stage2;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){}
    private static ThreadSafeSingleton getInstance(){
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
    // other useful methods here
    }


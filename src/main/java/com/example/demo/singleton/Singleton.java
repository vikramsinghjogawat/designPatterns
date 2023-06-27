package com.example.demo.singleton;

public class Singleton {

    private static Singleton instance = null;

    private Singleton(){};

    public static Singleton getInstance(){
        if(instance==null){
            return new Singleton(); //lazy instantiation
        }
            return instance;

    }
}

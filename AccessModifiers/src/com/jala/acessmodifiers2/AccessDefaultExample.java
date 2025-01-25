package com.jala.acessmodifiers2;

public class AccessDefaultExample {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        System.out.println("Default Field: " + obj.defaultField);
        obj.defaultMethod();
    }
}
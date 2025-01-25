package com.jala.acessmodifiers;

public class PrivateExample {
    private int privateField = 10;

    private void privateMethod() {
        System.out.println("Private Method Called");
    }

    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();
        System.out.println("Private Field: " + obj.privateField);
        obj.privateMethod();
    }
}
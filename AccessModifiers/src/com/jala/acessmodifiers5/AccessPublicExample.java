package com.jala.acessmodifiers5;

public class AccessPublicExample {
    public static void main(String[] args) {
        PublicExample obj = new PublicExample();
        System.out.println("Public Field: " + obj.publicField);
        obj.publicMethod();
    }
}
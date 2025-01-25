package com.jala.acessmodifiers3;

public class AccessProtectedExample {
    public static void main(String[] args) {
        ProtectedExample obj = new ProtectedExample();
        System.out.println("Protected Field: " + obj.protectedField);
        obj.protectedMethod();
    }
}
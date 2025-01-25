package com.jala.acessmodifiers;

class SubClass extends PrivateExample {
    public void accessPrivateFieldsAndMethods() {
        // This will result in a compilation error
        // System.out.println(privateField);
        // privateMethod();
    }
}
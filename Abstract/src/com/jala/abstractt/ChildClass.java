package com.jala.abstractt;

public class ChildClass extends AbstractExample {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract Method Implemented in Child Class");
    }

    public static void main(String[] args) {
        // Creating an object for the child class
        ChildClass child = new ChildClass();

        // Accessing non-abstract method from abstract class
        child.nonAbstractMethod();

        // Calling the abstract method implemented in the child class
        child.abstractMethod();
    }
}

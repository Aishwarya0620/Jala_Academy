package com.jala.abstractt;

public class ChildClassWithAbstractCall extends AbstractExample {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract Method Called in Child Class");
    }

    public static void main(String[] args) {
        // Creating an instance of the child class
        ChildClassWithAbstractCall child = new ChildClassWithAbstractCall();

        // Calling the abstract method
        child.abstractMethod();
    }
}

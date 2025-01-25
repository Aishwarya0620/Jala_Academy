package com.jala.abstractt;

public class ChildClassWithNonAbstractCall extends AbstractExample {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract Method Called in Child Class");
    }

    public static void main(String[] args) {
        // Creating an instance of the child class
        ChildClassWithNonAbstractCall child = new ChildClassWithNonAbstractCall();

        // Calling the non-abstract method from the abstract class
        child.nonAbstractMethod();
    }
}

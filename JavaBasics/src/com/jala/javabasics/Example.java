// Define a class
package com.jala.javabasics;

public class Example {

    // Define a method
    public void greet(String name) { // Method signature: greet(String)
        System.out.println("Hello, " + name + "!");
    }

    // Main method to create an object and call the method
    public static void main(String[] args) {
        // Create an object of the Example class
        Example obj = new Example();

        // Call the method using the object
        obj.greet("Alice");
    }
}

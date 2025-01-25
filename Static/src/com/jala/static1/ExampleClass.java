package com.jala.static1;

public class ExampleClass {

    // Static variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // Instance variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // Static method 1
    public static void staticMethod1() {
        System.out.println("Static Method 1");
        // Static methods cannot directly access instance variables
        // To access instance variables, create an object of the class
        ExampleClass obj = new ExampleClass();
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }

    // Static method 2
    public static void staticMethod2() {
        System.out.println("Static Method 2");
        // Static methods cannot directly access instance variables
        // To access instance variables, create an object of the class
        ExampleClass obj = new ExampleClass();
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }

    // Instance method 1
    public void instanceMethod1() {
        System.out.println("Instance Method 1");
        // Instance methods can access static variables directly
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
    }

    // Instance method 2
    public void instanceMethod2() {
        System.out.println("Instance Method 2");
        // Instance methods can access static variables directly
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);
        System.out.println("Instance Variable 1: " + instanceVar1);
        System.out.println("Instance Variable 2: " + instanceVar2);
    }

    // Main method
    public static void main(String[] args) {
        // Print static variables directly in main method
        System.out.println("In Main Method:");
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

        // Create an object of the class to access instance variables and methods
        ExampleClass obj = new ExampleClass();

        // Print instance variables in main method
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);

        // Call instance methods in main method
        obj.instanceMethod1();
        obj.instanceMethod2();

        // Call static methods in main method
        staticMethod1();
        staticMethod2();

        // Call instance methods from static methods (via the object created in static methods)
        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}

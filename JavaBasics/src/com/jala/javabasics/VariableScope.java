package com.jala.javabasics;

public class VariableScope {

    // Global variable (also called instance variable)
    int number = 50;

    public void displayVariables() {
        // Local variable with the same name as the global variable
        int number = 20;

        // Printing the local variable
        System.out.println("Local variable (number): " + number);

        // Printing the global variable using 'this' keyword
        System.out.println("Global variable (this.number): " + this.number);
    }

    public static void main(String[] args) {
        VariableScope obj = new VariableScope();
        obj.displayVariables();
    }
}

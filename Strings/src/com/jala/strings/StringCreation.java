package com.jala.strings;

public class StringCreation {
    public static void main(String[] args) {
        // Using String literal
        String str1 = "Hello";
        // Using new keyword
        String str2 = new String("World");
        // Using String.valueOf()
        String str3 = String.valueOf(123);

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
    }
}

package com.jala.strings;

public class StringMatch {
    public static void main(String[] args) {
        String str = "Hello World";
        
        // Matching the string with a regular expression
        boolean matches = str.matches("Hello.*");
        System.out.println("Does the string match 'Hello.*'? " + matches);
    }
}

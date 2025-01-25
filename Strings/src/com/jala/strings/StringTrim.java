package com.jala.strings;

public class StringTrim {
    public static void main(String[] args) {
        String str = "   Hello World!   ";
        
        // Trimming leading and trailing spaces
        String trimmed = str.trim();
        System.out.println("Trimmed String: '" + trimmed + "'");
    }
}

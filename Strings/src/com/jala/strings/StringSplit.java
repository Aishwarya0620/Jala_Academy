package com.jala.strings;

public class StringSplit {
    public static void main(String[] args) {
        String str = "Hello World";
        
        // Splitting the string by space
        String[] words = str.split(" ");
        
        System.out.println("Splitting String:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}

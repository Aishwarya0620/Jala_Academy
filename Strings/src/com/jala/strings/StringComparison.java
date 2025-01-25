package com.jala.strings;

public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        
        System.out.println("str1 equals str2: " + str1.equals(str2));
        System.out.println("str1 equalsIgnoreCase 'hello': " + str1.equalsIgnoreCase("hello"));
        System.out.println("str1 startsWith 'He': " + str1.startsWith("He"));
        System.out.println("str2 endsWith 'ld': " + str2.endsWith("ld"));
        System.out.println("str1 compareTo str2: " + str1.compareTo(str2));
    }
}

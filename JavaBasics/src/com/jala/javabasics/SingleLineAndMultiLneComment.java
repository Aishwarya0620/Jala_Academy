package com.jala.javabasics;

public class SingleLineAndMultiLneComment {

    public static void main(String[] args) {
        // This is a single-line comment
        System.out.println("Single-line comment example");

        /*
         * This is a multi-line comment
         * It can span across multiple lines
         */
        System.out.println("Multi-line comment example");

        /**
         * This is a documentation comment
         * It is used to generate documentation using Javadoc tool
         * 
         * @param args Command-line arguments
         */
        displayDocCommentExample();
    }

    /**
     * This method demonstrates a documentation comment
     */
    public static void displayDocCommentExample() {
        System.out.println("Documentation comment example");
    }
}

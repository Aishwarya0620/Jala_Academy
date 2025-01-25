package com.jala.loops;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, reversed = 0, remainder, originalNum;
        originalNum = num;
        while (num != 0) {
            remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        if (originalNum == reversed) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is not a palindrome.");
        }
    }
}

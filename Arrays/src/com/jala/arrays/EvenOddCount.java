package com.jala.arrays;

public class EvenOddCount {
    public static void main(String[] args) {
        int[] arr = {10, 15, 20, 25, 30};
        countEvenOdd(arr);
    }

    public static void countEvenOdd(int[] arr) {
        int evenCount = 0, oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);
    }
}

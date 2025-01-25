package com.jala.arrays;

public class VerifyElements {
    public static void main(String[] args) {
        int[] arr = {10, 12, 23, 30, 40};
        System.out.println("Contains 12 and 23: " + containsTwoElements(arr, 12, 23));
    }

    public static boolean containsTwoElements(int[] arr, int elem1, int elem2) {
        boolean containsFirst = false, containsSecond = false;
        for (int num : arr) {
            if (num == elem1) containsFirst = true;
            if (num == elem2) containsSecond = true;
        }
        return containsFirst && containsSecond;
    }
}

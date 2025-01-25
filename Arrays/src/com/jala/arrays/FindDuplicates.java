package com.jala.arrays;

import java.util.HashSet;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 40, 40};
        findDuplicates(arr);
    }

    public static void findDuplicates(int[] arr) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            if (!seen.add(num)) {
                System.out.println("Duplicate: " + num);
            }
        }
    }
}


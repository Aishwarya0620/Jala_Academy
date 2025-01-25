package com.jala.arrays;

import java.util.HashSet;

public class RemoveDuplicatesArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 30, 40, 40};
        int[] result = removeDuplicates(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }
        return result;
    }
}

package com.jala.arrays;

public class MinMaxArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] result = findMinMax(arr);
        System.out.println("Min: " + result[0] + ", Max: " + result[1]);
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }
}


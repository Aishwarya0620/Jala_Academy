package com.jala.arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] copiedArr = copyArray(arr);
        for (int num : copiedArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        return newArr;
    }
}


package com.jala.arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] newArr = insertElement(arr, 2, 25); // Insert 25 at index 2
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] insertElement(int[] arr, int index, int element) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0, j = 0; i < arr.length; i++, j++) {
            if (i == index) {
                newArr[j++] = element;
            }
            newArr[j] = arr[i];
        }
        return newArr;
    }
}

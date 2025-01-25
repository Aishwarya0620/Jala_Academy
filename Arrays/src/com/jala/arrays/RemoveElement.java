package com.jala.arrays;

import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int[] newArr = removeElement(arr, 30);
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }

    public static int[] removeElement(int[] arr, int value) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != value) {
                list.add(num);
            }
        }
        // Convert ArrayList back to array
        return list.stream().mapToInt(i -> i).toArray();
    }
}

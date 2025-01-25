package com.jala.collection_framework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet with at least 10 elements of type String
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");
        hashSet.add("Date");
        hashSet.add("Elderberry");
        hashSet.add("Fig");
        hashSet.add("Grape");
        hashSet.add("Honeydew");
        hashSet.add("Kiwi");
        hashSet.add("Lemon");

        System.out.println("Initial HashSet: " + hashSet);

        // Add an element to the HashSet
        hashSet.add("Mango");
        System.out.println("After adding an element: " + hashSet);

        // Attempt to add a duplicate element
        hashSet.add("Apple");
        System.out.println("After attempting to add a duplicate element: " + hashSet);

        // Check if a specific element is present in the HashSet
        String elementToCheck = "Banana";
        System.out.println("Is '" + elementToCheck + "' present? " + hashSet.contains(elementToCheck));

        // Remove an element from the HashSet
        hashSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + hashSet);

        // Iterate through the HashSet using an Iterator
        System.out.println("Iterating through the HashSet:");
        Iterator<String> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Check if the HashSet is empty
        System.out.println("Is the HashSet empty? " + hashSet.isEmpty());

        // Find the size of the HashSet
        System.out.println("Size of the HashSet: " + hashSet.size());

        // Clear all elements in the HashSet
        hashSet.clear();
        System.out.println("After clearing the HashSet: " + hashSet);
    }
}

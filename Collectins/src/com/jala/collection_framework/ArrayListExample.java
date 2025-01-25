package com.jala.collection_framework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create an ArrayList of type String
        ArrayList<String> stringList = new ArrayList<>();

        // Add 10 elements to the ArrayList
        for (int i = 1; i <= 10; i++) {
            stringList.add("Element" + i);
        }
        System.out.println("Initial ArrayList: " + stringList);

        // Add an element to the ArrayList
        stringList.add("NewElement");
        System.out.println("After adding an element: " + stringList);

        // Iterate through the ArrayList using an Iterator
        System.out.println("Iterating through the ArrayList:");
        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Add an element at a specific index
        stringList.add(5, "InsertedElement");
        System.out.println("After adding an element at index 5: " + stringList);

        // Remove an element by value
        stringList.remove("Element2");
        System.out.println("After removing 'Element2': " + stringList);

        // Remove an element by index
        stringList.remove(3);
        System.out.println("After removing element at index 3: " + stringList);

        // Update the element at a specific index
        stringList.set(4, "UpdatedElement");
        System.out.println("After updating element at index 4: " + stringList);

        // Check if an element is present at a particular index
        int indexToCheck = 2;
        if (indexToCheck < stringList.size()) {
            System.out.println("Element at index " + indexToCheck + ": " + stringList.get(indexToCheck));
        } else {
            System.out.println("Index " + indexToCheck + " is out of bounds.");
        }

        // Get an element at a particular index
        int indexToGet = 6;
        if (indexToGet < stringList.size()) {
            System.out.println("Element at index " + indexToGet + ": " + stringList.get(indexToGet));
        } else {
            System.out.println("Index " + indexToGet + " is out of bounds.");
        }

        // Find out the size of the ArrayList
        System.out.println("Size of the ArrayList: " + stringList.size());

        // Check if a given element is present in the ArrayList
        String elementToCheck = "UpdatedElement";
        if (stringList.contains(elementToCheck)) {
            System.out.println("The element '" + elementToCheck + "' is present in the ArrayList.");
        } else {
            System.out.println("The element '" + elementToCheck + "' is not present in the ArrayList.");
        }

        // Remove all elements of the ArrayList
        stringList.clear();
        System.out.println("After removing all elements, ArrayList: " + stringList);
    }
}

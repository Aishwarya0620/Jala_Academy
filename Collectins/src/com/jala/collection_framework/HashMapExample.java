package com.jala.collection_framework;

import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap with at least 10 key-value pairs of Student ID and Name
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        studentMap.put(104, "David");
        studentMap.put(105, "Eva");
        studentMap.put(106, "Frank");
        studentMap.put(107, "Grace");
        studentMap.put(108, "Hannah");
        studentMap.put(109, "Ian");
        studentMap.put(110, "Jack");

        System.out.println("Initial HashMap: " + studentMap);

        // Insert a key-value mapping into the map
        studentMap.put(111, "Karen");
        System.out.println("After adding a new key-value pair: " + studentMap);

        // Fetch the value of a key
        int keyToFetch = 103;
        System.out.println("Value for key " + keyToFetch + ": " + studentMap.get(keyToFetch));

        // Create a clone/copy of HashMap
        HashMap<Integer, String> clonedMap = (HashMap<Integer, String>) studentMap.clone();
        System.out.println("Cloned HashMap: " + clonedMap);

        // Check if the given key is in the map
        int keyToCheck = 105;
        System.out.println("Does key " + keyToCheck + " exist? " + studentMap.containsKey(keyToCheck));

        // Check if the value is in the map
        String valueToCheck = "Eva";
        System.out.println("Does value '" + valueToCheck + "' exist? " + studentMap.containsValue(valueToCheck));

        // Check if the map is empty
        System.out.println("Is the HashMap empty? " + studentMap.isEmpty());

        // Print the size of the map
        System.out.println("Size of the HashMap: " + studentMap.size());

        // Print all the keys of the map
        System.out.println("All keys in the HashMap: " + studentMap.keySet());

        // Print all the values of the map
        System.out.println("All values in the HashMap: " + studentMap.values());

        // Remove a specific key-value pair
        int keyToRemove = 109;
        studentMap.remove(keyToRemove);
        System.out.println("After removing key " + keyToRemove + ": " + studentMap);

        // Copy all elements of the map to another map
        HashMap<Integer, String> anotherMap = new HashMap<>();
        anotherMap.putAll(studentMap);
        System.out.println("New HashMap after copying: " + anotherMap);
    }
}

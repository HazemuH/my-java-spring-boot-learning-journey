import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ArraysAndCollection {
    public static void main(String[] args) {
        // Arrays
        // - Fixed size: Arrays have a fixed length once defined and cannot change.
        // - Efficient for primitive types: They are efficient for storing primitive data types like int, char, etc.
        // - Use when the size is known and won't change.
        int[] intArray = { 1, 2, 3, 4, 5 };
        String[] stringArray = { "apple", "banana", "cherry" };

        System.out.println("Array Example:");
        for (int num : intArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (String fruit : stringArray) {
            System.out.print(fruit + " ");
        }
        System.out.println("\n");

        // ArrayList
        // - Dynamic size: ArrayLists can grow or shrink dynamically as elements are added or removed.
        // - Use when you need a flexible, resizable collection of objects.
        // - Supports generics: Can store objects of any type, including custom classes.
        ArrayList<String> fruitsList = new ArrayList<>();
        fruitsList.add("apple");
        fruitsList.add("banana");
        fruitsList.add("cherry");

        System.out.println("ArrayList Example:");
        for (String fruit : fruitsList) {
            System.out.print(fruit + " ");
        }
        System.out.println("\n");

        // HashMap
        // - Key-value pairs: HashMaps store data as key-value pairs.
        // - Efficient for retrieval: Provides quick access to values based on keys.
        // - Use when you need to associate one value with another (e.g., dictionaries, caches).
        // - Supports generics: Can store key-value pairs of any types.
        HashMap<Integer, String> studentMap = new HashMap<>();
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");

        System.out.println("HashMap Example:");
        for (int studentId : studentMap.keySet()) {
            String studentName = studentMap.get(studentId);
            System.out.println("Student ID: " + studentId + ", Student Name: " + studentName);
        }
        System.out.println();

        // HashSet
        // - Unique elements: HashSet stores a collection of unique elements.
        // - Efficient for deduplication: Useful for removing duplicates from a collection.
        // - Supports generics: Can store elements of any type.
        HashSet<String> uniqueNames = new HashSet<>();
        uniqueNames.add("Alice");
        uniqueNames.add("Bob");
        uniqueNames.add("Alice"); // Adding a duplicate, which will be ignored.

        System.out.println("HashSet Example:");
        for (String name : uniqueNames) {
            System.out.println(name);
        }

        // Summary:
        // - Arrays are used for fixed-size collections of primitive types or objects.
        // - ArrayLists are used for dynamic, resizable collections of objects.
        // - HashMaps are used to store key-value pairs, providing efficient retrieval based on keys.
        // - HashSets are used for collections of unique elements, helping to remove duplicates.

    }
}

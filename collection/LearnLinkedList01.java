package collection;

import java.util.LinkedList; // Change 1: Imported LinkedList

public class LearnLinkedList01 {

    public static void main(String[] args) {

        // Change 2: Initialized as LinkedList
        LinkedList list = new LinkedList();

        // --- Standard List Methods (Same as ArrayList) ---
        list.add(11);
        list.add("11");
        list.add(11.11);
        list.add('1');
        list.add(null);

        System.out.println("List : " + list);
        System.out.println("Size : " + list.size());
        System.out.println("First element : " + list.get(0));
        System.out.println("Contains 11 ? : " + list.contains(11));

        list.set(1, "Java");
        System.out.println("After set : " + list);

        list.remove(2);
        System.out.println("After remove : " + list);

        list.add(1, "Inserted");
        System.out.println("After inserting : " + list);

        System.out.println("Is list empty ? : " + list.isEmpty());

        // --- Extra LinkedList Specific Methods (Not in ArrayList) ---
        System.out.println("------------ Extra LinkedList Methods ------------");
        
        list.addFirst("Start-of-List"); // Adds to index 0
        list.addLast("End-of-List");     // Adds to the very end
        System.out.println("After addFirst/Last: " + list);

        System.out.println("Get First: " + list.getFirst());
        System.out.println("Get Last: " + list.getLast());

        list.removeFirst(); // Removes element at index 0
        list.removeLast();  // Removes last element
        System.out.println("After removeFirst/Last: " + list);

        // --- Loops ---
        System.out.println("------------ Loop (Index) ------------");
        for(int i = 0; i < list.size(); i++){
            // Note: list.get(i) is slower in LinkedList (O(n))
            System.out.println("Index " + i + ": " + list.get(i));
        }

        System.out.println("------------ For Each ------------");
        for(Object ob : list){
            System.out.println(ob);
        }

        // --- Collection Methods ---
        System.out.println("------------ Collection Methods ------------");

        LinkedList list2 = new LinkedList();
        list2.add("Java");
        list2.add("Python");
        list2.add("C++");

        System.out.println("List2 : " + list2);

        // addAll()
        list.addAll(list2);
        System.out.println("After addAll : " + list);

        // containsAll()
        System.out.println("ContainsAll list2 ? : " + list.containsAll(list2));

        // indexOf()
        System.out.println("Index of Java : " + list.indexOf("Java"));

        // lastIndexOf()
        System.out.println("Last index of Java : " + list.lastIndexOf("Java"));

        // removeAll()
        list.removeAll(list2);
        System.out.println("After removeAll : " + list);

        // retainAll() - list2 keeps only what is in list
        list2.retainAll(list);
        System.out.println("After retainAll : " + list2);

        // toArray()
        Object arr[] = list.toArray();
        System.out.println("Array elements : ");
        for(Object obj : arr){
            System.out.println(obj);
        }

        // clear()
        list.clear();
        System.out.println("After clear : " + list);
    }
}

/* 
    DIFFERENCES & KEY POINTS:
    
    1. Data Structure: ArrayList uses a dynamic array. LinkedList uses a Doubly-Linked List.
    2. Performance: 
        - ArrayList is better for storing and accessing (get/set) data.
        - LinkedList is better for manipulating (adding/removing) data, especially at the ends.
    3. Memory: LinkedList uses more memory because every node stores the data + pointers to next and previous nodes.
    4. Extra Interface: LinkedList implements both 'List' and 'Deque' (Double Ended Queue).
    
    UNIQUE METHODS USED:
    - addFirst(), addLast()
    - getFirst(), getLast()
    - removeFirst(), removeLast()
*/
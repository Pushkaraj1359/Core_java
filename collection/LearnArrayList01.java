package collection;

import java.util.ArrayList;

public class LearnArrayList01 {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        // add()
        list.add(11);
        list.add("11");
        list.add(11.11);
        list.add('1');
        list.add(null);

        System.out.println("List : " + list);

        // size()
        System.out.println("Size : " + list.size());

        // get()
        System.out.println("First element : " + list.get(0));

        // contains()
        System.out.println("Contains 11 ? : " + list.contains(11));

        // set()
        list.set(1, "Java");
        System.out.println("After set : " + list);

        // remove()
        list.remove(2);
        System.out.println("After remove : " + list);

        // add(index,element)
        list.add(1, "Inserted");
        System.out.println("After inserting : " + list);

        // isEmpty()
        System.out.println("Is list empty ? : " + list.isEmpty());

        System.out.println("------------ Loop ------------");

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("------------ For Each ------------");

        for(Object ob : list){
            System.out.println(ob);
        }

        System.out.println("------------ Collection Methods ------------");

        // Second list
        ArrayList list2 = new ArrayList();
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

        // retainAll()
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


// Key Points (Important for Interview)

// ✔ ArrayList allows duplicates
// ✔ Maintains insertion order
// ✔ Dynamic size
// ✔ Uses index like array
// ✔ add() → add element
// ✔ contains() → check element
// ✔ remove() → remove element


/* Note :- 

Add → ADD new element

set → SET / REPLACE existing element  */



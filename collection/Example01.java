package collection;

import java.util.ArrayList;

public class Example01 {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        // add() → add elements
        list.add(11);
        list.add("11");
        list.add(11.11);
        list.add('1');
        list.add(null);

        System.out.println("List : " + list);

        // size() → number of elements
        System.out.println("Size : " + list.size());

        // get() → access element using index
        System.out.println("First element : " + list.get(0));

        // contains() → check element exists
        System.out.println("Contains 11 ? : " + list.contains(11));

        // set() → replace element
        list.set(1, "Java");
        System.out.println("After set : " + list);

        // remove() → remove element by index
        list.remove(2);
        System.out.println("After remove : " + list);

        // isEmpty() → check list empty
        System.out.println("Is list empty ? : " + list.isEmpty());

        // add at specific index
        list.add(1, "Inserted");
        System.out.println("After inserting : " + list);

        System.out.println("------------ For Loop ------------");

        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("------------ For Each ------------");

        for(Object ob : list){
            System.out.println(ob);
        }

        // clear() → remove all elements
        list.clear();
        System.out.println("After clear : " + list);
    }
}


/* Note :- 

Add → ADD new element

set → SET / REPLACE existing element  */



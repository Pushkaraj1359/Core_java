
// Write a   Java  program to insert an element in an array.



package arrayList_Assignment;
import  java.util.ArrayList;

public class Program05 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("before inserting element array :"+numbers);
        
        numbers.add(1,2);   //    add(index,element);
        
        System.out.println("After inserting element array :"+numbers);

    }
}

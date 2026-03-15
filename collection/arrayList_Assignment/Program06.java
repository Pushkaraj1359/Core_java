
// Write a   Java  program to delete an element from an array at specified position.

package arrayList_Assignment;
import java.util.ArrayList;

public class Program06 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(07);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);

        System.out.println("before delete element :"+numbers);
        
        numbers.remove(3);   // delete(index);
        
        System.out.println("after delete element :"+numbers);

    }
}

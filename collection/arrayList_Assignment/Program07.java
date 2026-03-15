// Write a   Java  program to find the reverse of an array.

package arrayList_Assignment;
import java.util.ArrayList;
public class Program07 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("original array :"+numbers);

        for(int i=numbers.size()-1;i>=0;i--){
            System.out.print(numbers.get(i)+" ");
        }
    }
}

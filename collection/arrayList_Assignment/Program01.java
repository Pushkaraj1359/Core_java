
// Write a   Java  program to find the sum of all array elements.    

package arrayList_Assignment;
import java.util.ArrayList;

public class Program01 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        int sum = 0;

        for(int num : numbers){
            sum = sum + num ;
        }
        System.out.print("The sum of array elements is :"+sum);
    }
}

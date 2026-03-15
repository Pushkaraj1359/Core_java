// Write a   Java  program to count the total number of negative elements in an array.

package arrayList_Assignment;
import java.util.ArrayList;

public class Program04 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        numbers.add(-3);
        numbers.add(1);
        numbers.add(-1);
        numbers.add(1);
        numbers.add(-2);

        int count = 0;
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i) < 0){
                count++;
            }
        }
        System.out.println("count negative numbers :"+count);
    }
}


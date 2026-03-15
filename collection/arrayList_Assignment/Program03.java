// Write a   Java  program to count the total number of even and odd elements in an array.

package arrayList_Assignment;
import java.util.ArrayList;

public class Program03 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        int evenCount = 0;
        int oddCount = 0;
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.println("evenCount :"+evenCount);
        System.out.println("oddCount :"+oddCount);
    }
}

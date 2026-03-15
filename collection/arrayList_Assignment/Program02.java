
// Write a   Java  program to find maximum and minimum elements in an array.   

package arrayList_Assignment;
import java.util.ArrayList;

public class Program02 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int min = numbers.get(0);
        int max = numbers.get(0);

        for(int i=0;i<numbers.size();i++){

            if(numbers.get(i) > max){
                max =  numbers.get(i);
            }
            
            if(numbers.get(i)<min){
                min=numbers.get(i);
            }
        }
        System.out.println("the min element is :"+min);
        System.out.println("the max element is :"+max);
    }
}

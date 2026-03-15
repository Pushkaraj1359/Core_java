
// Sort an ArrayList
// Write a Java program to sort an ArrayList in ascending order.

package chatgptProblemPractice;
import java.util.ArrayList;
public class Program04 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(5);
        numbers.add(4);
        numbers.add(2);
        numbers.add(3);
        numbers.add(6);

        System.out.println("Number list : "+numbers);

        for(int i=0;i<numbers.size();i++){
            for(int j=i+1;j<numbers.size();j++){
                if(numbers.get(i) > numbers.get(j)){
                    int temp = numbers.get(i);
                    numbers.set(i,numbers.get(j));
                    numbers.set(j,temp);
                }
            }
        }
    System.out.println("after sort list : "+numbers);
    }
}




// we can also use this short and easily way 
// import java.util.Collections;

// Collections.sort(numbers);

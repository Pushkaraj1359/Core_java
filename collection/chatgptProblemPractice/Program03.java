
// Remove Duplicate Elements
// Write a Java program to remove duplicate numbers from an ArrayList.

package chatgptProblemPractice;
import java.util.ArrayList;

public class Program03 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList();
        ArrayList<Integer> uniqueNum = new ArrayList();
        
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        numbers.add(30);
        numbers.add(40);

        for(int i=0;i<numbers.size();i++){
            int num = numbers.get(i);

            if(!uniqueNum.contains(num)){
                uniqueNum.add(num);
            }
        }
        System.out.println("original numbers : "+numbers);
        System.out.println("after removing duplicates numbers : "+uniqueNum);
    }
}


// Remove Elements Greater Than 50
// Write a Java program to remove all numbers greater than 50 from an ArrayList.


package chatgptProblemPractice;
import java.util.ArrayList;

public class Program08 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList();

        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(90);
        numbers.add(30);
        numbers.add(50);
        numbers.add(70);

        System.out.println("original Number list : "+numbers);
        for(int i=0;i<numbers.size();i++){
            int num = numbers.get(i);

            if(num > 50){
                numbers.remove(i);
                i--;    // after removing element must adjust index
            }
        }
        System.out.println("Remove Element Greater than 50 :"+numbers);
    }
}

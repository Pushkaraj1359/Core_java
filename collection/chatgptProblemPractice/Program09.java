
// Find missing Number..

package chatgptProblemPractice;
import java.util.ArrayList;

public class Program09 {
    public static void main(String[] args){
    ArrayList<Integer> numbers = new ArrayList();

    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    int n = numbers.size() + 1;
    int expectedSum = n * (n+1)/2;
    int actualSum = 0;

    for(int i=0;i<numbers.size();i++){
        actualSum = actualSum + numbers.get(i);
    }

    System.out.println(expectedSum - actualSum);
    }
}

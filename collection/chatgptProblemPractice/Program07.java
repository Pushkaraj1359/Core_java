
// Merge Two ArrayLists
// Write a Java program to merge two ArrayLists into one.



package chatgptProblemPractice;
import java.util.ArrayList;

public class Program07 {
    public static void main(String[] args){
        ArrayList<Integer> numbers1 = new ArrayList();
        ArrayList<Integer> numbers2 = new ArrayList();


        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);

        System.out.println("list first : "+numbers1);
        
        numbers2.add(6);
        numbers2.add(7);
        numbers2.add(8);
        numbers2.add(9);
        numbers2.add(10);
        
        System.out.println("list second : "+numbers2);
        
        numbers1.addAll(numbers2);

        System.out.println("after merge two ArrayList into one"+numbers1);

    }
}

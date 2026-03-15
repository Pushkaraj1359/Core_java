
// Write a   Java  program to search an element in an array.

package arrayList_Assignment;
import java.util.ArrayList;
public class Program09 {
    public static void main(String[] args) {
        
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("all elements :"+numbers);

        int search = 6;
        boolean found = false;

        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i) == search){
                found  = true;
                break;
            }  
        }
        if(found){
            System.out.println("element is found :"+ search);
        }
        else{
            System.out.println("element is not found..");
        }
    }
}


// Write a   Java  program to search an element in an array.

package arrayList_Assignment;
import java.util.ArrayList;
public class Program09 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        int search = 30;
        boolean found = false;

        for(int i = 0; i < arr.size(); i++){
            if(arr.get(i) == search){
                found = true;
                break;
            }
        }

        if(found){
            System.out.println("Element found in array : "+search);
        }
        else{
            System.out.println("Element not found in array");
        }
    }
}

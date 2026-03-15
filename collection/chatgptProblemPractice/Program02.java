
// Write a Java program to search a given number in an ArrayList and print whether it exists or not.

package chatgptProblemPractice;

import java.util.ArrayList;

public class Program02 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);

        
        
        
        // using forEach loop
        // int num = 6;
        // for(int n : numbers){
            //     if(n == num){
                //         System.out.println("numbers is exist : "+num);
                //         break;
                //     }
                // }
        
                
        // using for loop
        int num = 6;
        boolean found = false;
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i) == num){
                found = true;
                break;
            }
        }
        if(found){
            System.out.println("number is exist : "+num);
        }
        else{
            System.out.println("number is not exist : "+num);
        }
    }
}


// Second Largest Number
// Write a Java program to find the second largest element in an ArrayList.

package chatgptProblemPractice;

import java.util.ArrayList;

public class Program05 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(8);
        numbers.add(15);

        int largest = numbers.get(0);
        int secondLargest = numbers.get(0);

        for(int i = 0; i < numbers.size(); i++){

            if(numbers.get(i) > largest){
                secondLargest = largest;
                largest = numbers.get(i);
            }
            else if(numbers.get(i) > secondLargest && numbers.get(i) != largest){
                secondLargest = numbers.get(i);
            }
        }

        System.out.println("Largest Number : " + largest);
        System.out.println("Second Largest Number : " + secondLargest);
    }
}


// Frequency of Element
// Write a Java program to count how many times a particular number appears in an ArrayList.


package chatgptProblemPractice;

import java.util.ArrayList;
public class Program06 {
    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList();

        numbers.add(10);
        numbers.add(5);
        numbers.add(10);
        numbers.add(8);
        numbers.add(15);
        numbers.add(10);

        int targer = 10;
        int count = 0;

        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i) == targer){
                count++;
            }
        }
        System.out.println("Frequency of Element : "+ count);
    }
}

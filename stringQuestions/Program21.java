
// Q21. Capitalize First Letter of Each Word

// Problem: Capitalize the first letter of every word.
// Input: hello i am java developer
// Output: Hello I Am Java Developer

package stringQuestions;

public class Program21 {
    public static void main(String[] args){
        String str = "hello i am java developer";
        String[] arr = str.split(" ");
        String result = "";

        for(int i = 0; i < arr.length; i++){
            String word = arr[i];

            char firstChar = Character.toUpperCase(word.charAt(0));
            String rest = word.substring(1);

            result = result + firstChar + rest + " ";
        }

        System.out.println(result);
    }
}
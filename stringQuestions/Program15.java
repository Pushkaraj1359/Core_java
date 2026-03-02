// Q15. Append Length of Each Word

// Problem: Add length of each word at the end of the word.
// Input: hello i am java developer
// Output: hello5 i1 am2 java4 developer9



package stringQuestions;

public class Program15 {
    public static void main(String[] args) {
        
    // Method 01
        // String str = "hello i am java developer";
        // String[] words = str.split(" ");

        // for(int i=0;i<words.length;i++){
        //     System.out.print(words[i]+words[i].length()+" ");
        // }

    //Method 02
        String str = "hii i am java developer";
        String[] words = str.split(" ");

        // StringBuilder cant accept string array as argument.
        // in case if we mension string array as argument then it will gives compile time error.
        StringBuilder sb= new StringBuilder();

        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            sb.append(words[i].length());
            sb.append(" ");
        }
        System.err.println(sb);


    }
}

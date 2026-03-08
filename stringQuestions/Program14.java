// Q14. Append Word Position to Each Word

// Problem: Append word number (starting from 1) to each word.
// Input: hello i am java developer
// Output: hello1 i2 am3 java4 developer5



package stringQuestions;

public class Program14 {
    public static void main(String[] args) {
    
    // Method 01
        // String str="hello i am java developer";
        // String[] words = str.split(" ");

        // for(int i=0;i<words.length;i++){
        //     System.out.print(words[i]+(i+1)+" ");
        // }

    //Method 02 
        // String str = "hello i am java developer";
        // String[] words = str.split(" ");

        // StringBuilder sb = new StringBuilder();

        // for(int i=0;i<words.length;i++){
        //     sb.append(words[i]);
        //     sb.append(i+1);
        //     sb.append(" ");
        // }
        // sb.toString();
        // System.out.print(sb);


        
    }
}


/*
String is immutable (creates new object every time)
StringBuilder is mutable (faster for modifications)
Best for interview & performance

Interview Explanation:- 
"I used StringBuilder because it is efficient for string modifications.
I appended each word and its position using append() method.    */

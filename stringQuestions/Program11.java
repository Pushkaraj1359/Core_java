// Q11. Sort Words Lexicographically

// Problem: Sort all words in dictionary (alphabetical) order.
// Input: hello i am java developer
// Output: am developer hello i java 



package stringQuestions;

public class Program11 {
    public static void main(String[] args) {
        // String str = "hello i am java developer";
        // String[] words = str.split(" ");

        // for(int i=1;i<words.length;i++){
        //     for(int j=i+1;j<words.length;j++){
        //         if(words[i].compareTo(words[j]) > 0){
        //             String temp = words[i];
        //             words[i]=words[j];
        //             words[j]=temp;
        //         }
        //     }
        // }
        // for(String word : words){
        //     System.out.println(word+" ");
        // }

        String name = "kulkarni  pushkaraj balika saurabh";
        String[] words = name.split(" ");

        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].compareTo(words[j])>0){
                    String temp = words[i];
                    words[i] = words[j];
                    words[j]=temp;
                }
            }
        }
        for(String word : words){
            System.out.print(word+" ");
        }

    }
}




/*
Lexicographical order means arranging strings in dictionary order by comparing
characters based on their ASCII or Unicode values.
Very Simple Meaning
Lexicographically = Dictionary order (A to Z)

Comparison happens:
    Character by character
    Based on ASCII value
    Stops when difference is found

 */
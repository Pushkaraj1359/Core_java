// Q10. Find the Longest Word

// Problem: Print the longest word in a sentence.
// Input: welcome to international airport
// Output: international


package stringQuestions;

public class Program10 {
    public static void main(String[] args) {
        // String str = "welcome to international airport";

        // String[] words = str.split(" ");
        
        // String longest = "";

        // for(String word : words){
        //     if(word.length() > longest.length()){
        //         longest=word;
        //     }
        // }
        // System.out.println(longest);

        // String str = "kulkarni pushkaraj saurabh";
        // String[] words = str.split(" ");

        // String longest = "";
        // for(String word : words){
        //     if(word.length() > longest.length()){
        //         longest = word;
        //     }
        // }
        // System.out.println(longest+" : "+longest.length());


        String str = "welcome to international airport";
        String[] words = str.split(" ");
        String longer ="";

        for(int i=0;i<words.length;i++){
            String word = words[i];
            if(word.length()>longer.length()){
                longer= word;
            }
        }
        System.out.println(longer);
    }
}






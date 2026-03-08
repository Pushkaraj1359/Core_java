// Count Words in a Sentence

// Problem: Count the number of words in a sentence.
// Input: hello i am java developer
// Output: 5

package stringQuestions;

public class Program09 {
    public static void main(String[] args) {

    //Method 01
        // String str = "Java is very powerful language";
        // str = str.trim();

        // if(str.isEmpty()){
        //     System.out.println("Word count: 0");
        // } else {
        //     // str.split("\\s+") splits the string into words by using one or more whitespace characters as the separator.
        //     String[] words = str.split("\\s+");
        //     System.out.println("Word count: " + words.length);
        // }

    //Method 02
        // String str = "Java is very powerful language";

        // int count = 0;
        // boolean inWord = false;

        // for(int i = 0; i < str.length(); i++){

        //     if(str.charAt(i) != ' ' && inWord == false){
        //         count++;
        //         inWord = true;
        //     }

        //     else if(str.charAt(i) == ' '){
        //         inWord = false;
        //     }
        // }

        // System.out.println("Word count: " + count);


        // String str = "java is an powerful language";

        // int count = 0;
        // boolean inWord = false;

        // for(int i=0;i<str.length();i++){
        //     if(str.charAt(i) != ' ' && inWord == false){
        //         count++;
        //         inWord=true;
        //     }
        //     else if(str.charAt(i) == ' '){
        //         inWord = false;
        //     }
        // }
        // System.out.println(count);


        // String str = "Java is very powerful language";
        // int count = 0;
        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(" ".indexOf(ch) != -1){
        //         count++;
        //     }
        // }
        // System.out.println("number of words : "+count+1);

    }
}

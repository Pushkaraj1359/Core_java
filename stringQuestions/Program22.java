// Q22. Capitalize Only Vowels

// Problem: Convert only the vowels to uppercase in the sentence.
// Input: hello i am java developer
// Output: hEllO I Am jAvA dEvElOpEr


package stringQuestions;

public class Program22 {
    public static void main(String[] args) {
    // Method 01
        // String str = "hello i am java developer";
        // String result = "";

        // for(int i = 0; i < str.length(); i++) {
        //     char ch = str.charAt(i);

        //     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
        //         result = result + Character.toUpperCase(ch);
        //     } else {
        //         result = result + ch;
        //     }
        // }

        // System.out.println(result);

    //Method 02
        // String str = "hello i am java developer";
        // StringBuilder result = new StringBuilder();

        // for(char ch : str.toCharArray()) {
        //     if("aeiou".indexOf(ch) != -1) {
        //         result.append(Character.toUpperCase(ch));
        //     } else {
        //         result.append(ch);
        //     }
        // }

        // System.out.println(result);


        // String str = "hello i am java developer";
        // String result ="";

        // for(int i=0;i<str.length()-1;i++){
        //     char ch = str.charAt(i);

        //     if("aeiouAEIOU".indexOf(ch) != -1){
        //         char temp = Character.toUpperCase(ch);
        //         result = result + temp;
        //     }
        //     else if(ch == ' '){
        //         result = result + ch;
        //     }
        //     else{
        //         result = result + ch;
        //     }
        // }
        // System.out.println(result);


        String str = "hello i am java developer";
        String[] words = str.split(" ");

        String result = "";

        for(int i=0;i<words.length;i++){
            String word = words[i];
            String newWord = "";
            for(int j=0;j<word.length();j++){
                char ch = word.charAt(j);
                if(ch ==' '){
                    newWord = newWord + " ";
                }
                else if("aeiouAEIOU".indexOf(ch) != -1){
                    char up = Character.toUpperCase(ch);
                    newWord = newWord + up;
                }
                else{
                    newWord = newWord + ch;
                }
            }
            result = result + newWord + " ";
        }
        System.out.print(result);

    }
}

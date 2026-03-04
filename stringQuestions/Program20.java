// Q20. Remove Vowels but Keep Spaces and Append All Vowels at End

// Problem: Remove vowels from sentence and append them at end, preserving spaces.
// Input: hello i am java developer
// Output: hll  m jv dvlpr eoiaaaeeoe




package stringQuestions;

public class Program20 {
    public static void main(String[] args) {
    
    // Method 01
        // String str = "hello i am java developer";
        // String result ="";
        // String vowels="";

        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(ch == ' '){
        //         result = result + " ";
        //     }
        //     else if ("aeiou".indexOf(ch)!= -1) {
        //         vowels = vowels + ch;
        //     }
        //     else{
        //         result = result + ch;
        //     }
        // }
        // System.out.println(result.trim()+" "+vowels);


    //Method 02
        String str = "hello i am java developer";
        StringBuilder result = new StringBuilder();
        StringBuilder vowels = new StringBuilder();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                result.append(' ');
            }
            else if ("aeiou".indexOf(ch)!= -1) {
                vowels.append(ch);
            }
            else{
                result.append(ch);
            }
        }
        System.out.println(result.toString().trim()+" "+vowels.toString());
    }
}


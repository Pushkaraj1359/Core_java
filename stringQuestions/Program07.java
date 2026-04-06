// Move Vowels to End (Sorted), Keep Consonants First

// Problem: Separate consonants and vowels. Keep consonants in order and append sorted vowels.
// Input: International
// Output: ntrntnlAaeio



package stringQuestions;
import java.util.Arrays;

public class Program07 {
    public static void main(String[] args) {
        String str = "International";
        String vowels = "";
        String consonants = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if("aeiouAEIOU".indexOf(ch)!= -1){
                vowels = vowels + ch;
            }else{
                consonants = consonants + ch;
            }
        }
        // Convert vowels to char array
        char[] arr = vowels.toCharArray();
        
        // Sort vowels 
        Arrays.sort(arr);
        
        // Convert back to string
        vowels = new String(arr);
        
        String result = consonants + vowels;
        
        System.out.println(result);

        // String str = "International";
        // String vowels = "";
        // String consonants = "";
        // StringBuilder sb = new StringBuilder(str);

        // for(int i=1;i<sb.length();i++){
        //     char ch = sb.charAt(i);
        //     if("aeiouAEIOU".indexOf(ch)!= -1){
        //         vowels = vowels + ch;
        //     }
        //     else{
        //         consonants = consonants + ch;
        //     }
        // }
        // char [] arr = vowels.toCharArray();
        // Arrays.sort(arr);
        // vowels = new String(arr);
        // String result = consonants +  vowels;
        // System.out.println(result);
    }
}


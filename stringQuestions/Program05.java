// Q5. Replace Vowels with Vowel Count

// Problem: Replace vowels with the order they appear.
// Input: International
// Output: 1nt2rn3t45n6l


package stringQuestions;

public class Program05 {
    public static void main(String[] args){
    // Method 01
        // String str = "International";

        // int count = 0;
        // String result = "";

        // for(int i=0;i<str.length();i++){
        //     char ch = str.charAt(i);
        //     if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
        //         ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
        //             count++;
        //         result = result + count;
        //     }
        //     else{
        //         result = result + ch;
        //     }
        // }
        // System.out.println(result);

    // Method 02
        String str = "International";

        StringBuilder sb = new StringBuilder(str);
        int count = 0;
        String result = "";

        for(int i=0;i<sb.length();i++){
            char ch = sb.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || 
                ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){

                count++;
                result = result + count;
            }
            else{
                result = result + ch;
            }
        }
        System.out.println(result);

    }
}

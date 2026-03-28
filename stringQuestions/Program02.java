// Shift Last Character to First

// Problem: Move the last character of the string to the front.
// Input: India
// Output: aIndi


// package stringQuestions;

public class Program02 {
    public static void main(String[] args) {
        // method 01
        // String str = "India";

        // String result = str.substring(str.length() - 1) 
        //                + str.substring(0, str.length() - 1);

        // System.out.println(result);


        // method 02
        //         String str = "India";
        
        //         StringBuilder sb = new StringBuilder(str);
        
        //         char last = sb.charAt(sb.length() - 1);
        //         sb.deleteCharAt(sb.length() - 1);
        //         sb.insert(0, last);                    // insert(position, value)   position index=0  and value="a" (value)
        
        //         System.out.println(sb);


        //method 03

        // String str = "India";
        // String result = "";
        
        // char last = str.charAt(str.length() - 1);
        // result = result + last;
        
        // for(int i = 0; i < str.length() - 1; i++) {
        //     result = result + str.charAt(i);
        // }
        
        // System.out.println(result);


        
    }
}

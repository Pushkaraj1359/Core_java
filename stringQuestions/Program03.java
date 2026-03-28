// Question 03 :- Swap First and Last Characters

// Problem: Swap the first and last characters of the string.
// Input: India
// Output: andiI




package stringQuestions;

public class Program03 {
    public static void main(String[] args) {
        // method 01
            // String name = "Pushkaraj";
            // StringBuilder sb=new StringBuilder(name);

            // char first = sb.charAt(0);
            // char last =  sb.charAt(sb.length()-1);
            // String middle = sb.substring(1,sb.length()-1);   // subString method 
            // String result = last + middle + first;
            // System.out.println(result);
    
        // Method 02

            // String name = "Pushkaraj";

            // String first = name.substring(0,1);
            // String last  = name.substring(name.length()-1);
            // String middle = name.substring(1,name.length()-1);

            // String result = last + middle + first;
            // System.out.println(result);

        // Method 03

            // String name = "Pushkaraj";

            // char first = name.charAt(0);
            // char last = name.charAt(name.length()-1);

            // String result = "";

            // result = result + last;

            // for(int i=1;i<name.length()-1;i++){
            //     result = result + name.charAt(i);
            // }

            // result = result + first;
            // System.out.println(result);

    }
}



// sb.setCharAt(index, newCharacter);
// It does NOT insert and delete
// It only changes the existing character.


// substring(start, end)
// Start index → Included
// End index → Not Included

// Question 03 :- Swap First and Last Characters

// Problem: Swap the first and last characters of the string.
// Input: India
// Output: andiI




package stringQuestions;

public class Program {
    public static void main(String[] args) {
        // method 01
        String name = "Pushkaraj";
        StringBuilder sb=new StringBuilder(name);

        char first = sb.charAt(0);
        char last =  sb.charAt(sb.length()-1);
        String middle = sb.substring(1,sb.length()-1);   // subString method 
        String result = last + middle + first;
        System.out.println(result);
    }
}



// sb.setCharAt(index, newCharacter);


// substring(start, end)
// ✔ Start index → Included
// ❌ End index → Not Included

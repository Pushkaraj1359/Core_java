// Q24. Count Special Characters

// Problem: Count characters that are neither letters nor digits nor spaces.
// Input: hello? where are you!! i am fine!! thank you,.



package stringQuestions;

public class Program24 {
    public static void main(String[] args) {
    
    // Method 01
        // String str = "hello? where are you!! i am fine!! thank you,.";
        // int count = 0;
        
        // for(int i = 0; i < str.length(); i++){
        //     char ch = str.charAt(i);
        
        //     if(!Character.isLetter(ch) && !Character.isDigit(ch) && ch != ' '){
        //         count++;
        //     }
        // }
        
        // System.out.println("Special Characters: " + count);


    // Method 02
        String str = "hello? where are you!! i am fine!! thank you,.";

        StringBuilder specialChars = new StringBuilder();
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if(!Character.isLetter(ch) && !Character.isDigit(ch) && ch != ' '){
                count++;
                specialChars.append(ch);
            }
        }

        System.out.println("Count: " + count);
        System.out.println("Special Characters: " + specialChars);
    }
}

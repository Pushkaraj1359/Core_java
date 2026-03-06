// Q25. Remove Special Characters

// Problem: Remove all special characters, keeping letters, digits, and spaces only.
// Input: hello? where are you!! i am fine!! thank you,.
// Output: hello where are you i am fine thank you



package stringQuestions;

public class Program25 {
    public static void main(String[] args) {
            String str = "hello? where are you!! i am fine!! thank you,.";
            String result = "";

            for(int i = 0; i < str.length(); i++) {

                char ch = str.charAt(i);

                if(!((ch < 'a' || ch > 'z') && 
                    (ch < 'A' || ch > 'Z') && 
                    (ch < '0' || ch > '9') && 
                    ch != ' ')) {

                    result = result + ch;
                }
            }

            System.out.println(result);
    }
}

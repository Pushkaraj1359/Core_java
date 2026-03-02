// Q16. Shift First Letter of Each Word to the End

// Problem: Move first character of every word to the end
// Input: hello i am java developer
// Output: elloh i ma avaj eveloperd



package stringQuestions;

public class Program16 {
    public static void main(String[] args) {
    //Method 01
        // String str = "hello i am java developer";
        // String[] words = str.split(" ");
        // String result="";
        // for(int i=0;i<words.length;i++){
        //     String word = words[i];

        //     char first = word.charAt(0);
        //     String restString = word.substring(1);
        //     result = result + restString + first + " ";
        // }
        // System.out.println(result+ " ");

    // Method 02
        String str = "hello i am java developer";
        String[] words = str.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < words.length; i++) {

            String word = words[i];

            char first = word.charAt(0);        // first character
            String rest = word.substring(1);    // remaining string

            sb.append(rest);        // add remaining part
            sb.append(first);       // add first char at end
            sb.append(" ");         // add space
        }

        System.out.println(sb.toString());
    }
}

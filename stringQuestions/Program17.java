// Q17. Swap First and Last Letter of Each Word

// Problem: Swap the first and last character of each word.
// Input: hello i am java developer
// Output: oellh i ma avaj revelopd
// (Note: Your example was a little off. The output should reflect actual swap.)


package stringQuestions;

public class Program17 {
    public static void main(String[] args) {
    // Method 01
        // String str = "hello i am java developer";
        // String arr[] = str.split(" ");
        // String result = "";

        // for(int i=0;i<arr.length;i++){
        //     String word = arr[i];
        //     if(word.length()>1){
        //         char first = word.charAt(0);
        //         char last = word.charAt(word.length()-1);
        //         String rest = word.substring(1,word.length()-1);
        //         result = result + last + rest + first+ " ";
        //     }
        //     else{
        //         result = result + word + " ";
        //     }
        // }
        // System.out.println(result);

    // Method 02
        // String str = "hello i am java developer";
        // String[] arr = str.split(" ");

        // StringBuilder sb = new StringBuilder();

        // for(int i = 0; i < arr.length; i++) {

        //     String word = arr[i];

        //     if(word.length() > 1) {

        //         char first = word.charAt(0);
        //         char last = word.charAt(word.length() - 1);
        //         String middle = word.substring(1, word.length() - 1);

        //         sb.append(last);
        //         sb.append(middle);
        //         sb.append(first);
        //     }
        //     else {
        //         sb.append(word);
        //     }

        //     sb.append(" ");   // add space after each word
        // }

        // System.out.println(sb.toString());


        String str = "bkulkarnia bpushkaraja bsaurabha";
        String[] words = str.split(" ");
        String result = "";

        for(int i=0;i<words.length;i++){
            String word = words[i];
            for(int j=0;j<word.length();j++){
                char first  = word.charAt(0);
                char last  = word.charAt(word.length()-1);
                String middle = word.substring(1,word.length()-1);
                result = last+middle+first;
            }
            System.out.print(result+" ");
        }
    }
}

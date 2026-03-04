// Q18. Move First Character of Each Word to End of Sentence

// Problem: Remove the first letter of each word and append them at the end.
// Input: hello i am java developer
// Output: ello m ava eveloperhiajd


package stringQuestions;

public class Program18 {
    public static void main(String[] args) {

        String str = "hello i am java developer";
        String[] arr = str.split(" ");

        String firstChars = "";
        String restPart = "";

        for(int i = 0; i < arr.length; i++) {

            String word = arr[i];

            if(word.length() > 1) {

                firstChars = firstChars + word.charAt(0);   // collect first letters
                restPart = restPart + word.substring(1) + " ";  // collect remaining part
            }
            else {
                firstChars = firstChars + word;   // single letter word
            }
        }

        System.out.println(restPart.trim() + firstChars);
    
    // Method 02
        /*  String str = "hello i am java developer";
        String[] arr = str.split(" ");

        StringBuilder firstChar = new StringBuilder();
        StringBuilder restPart = new StringBuilder();

        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            if(word.length()>1){
                firstChar.append(word.charAt(0));
                restPart.append(word.substring(1));
                restPart.append(" ");
            }
            else{
                firstChar.append(word);
            }
        }
        System.out.println(restPart.toString() + firstChar.toString());  */
    }
}

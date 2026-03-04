// Q19. Replace Vowels in Each Word with Increasing Count

// Problem: In each word, replace vowels with increasing count (starting from 1 per word).
// Input: hello i am java developer
// Output: h1ll2 1 1m j1v2 d1v2l3p4r



package stringQuestions;

public class Program19 {
    public static void main(String[] args) {
        String str = "hello i am java developer";
        String [] arr = str.split(" ");

        String result = "";

        for(int i=0;i<arr.length;i++){
            String word = arr[i];
            String newWord ="";
            int count = 1;

            for(int j=0;j<word.length();j++){
                char ch = word.charAt(j);
                if("aeiou".indexOf(ch) != -1){
                    newWord = newWord + count;
                    count++;
                }
                else{
                    newWord = newWord + ch;
                }
            }
            result = result + newWord+ " ";
        }
        System.out.println(result.trim());
    }
}

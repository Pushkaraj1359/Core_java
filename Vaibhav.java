// public class Vaibhav{
//     static void operation(String str){
//         char[] ch = str.toCharArray();
//         boolean[] visited = new boolean[256];
//         int[] count = new int[256];
//         for(int i = 0; i<ch.length; i++){
//             count[ch[i]]++;
//         }
        
//         for(int i = 0; i<ch.length; i++){
//             if(visited[ch[i]]!=true){
//                 System.out.print(ch[i]+" ");
//                // System.out.print(count[ch[i]]+" ");
//                 visited[ch[i]]=true;

//             }
        
//     }
//     }

    
//     public static void main(String[] args) {
//         operation("abaaab");
//     }
// } 




// class Pra {

//     static void frequency(String str) {

//         int[] freq = new int[256]; // works for all characters

//         // Step 1: count frequency
//         for(int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);                                                                                    
//             freq[ch]++;
//         }

//         // Step 2: print without duplicates (in order)
//         for(int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);

//             if(freq[ch] != 0) {
//                 System.out.print(ch + " " + freq[ch] + " ");
//                 freq[ch] = 0; // mark as printed
//             }
//         }
//     }

//     public static void main(String[] args) {
//         frequency("vaibhav");
//     }
// }





class Vaibhav{
    static void operation(String str){

        int mix = 0;
        char res = ' ';

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);

            int count = 0;

            for(int j=0;j<str.length();j++){
                char ch1 = str.charAt(j);
                
                if(ch==ch1){
                    count++;
                }
            }
            if(count>mix){
                mix = count;
                res = str.charAt(i);
            }
        }
        System.out.print(res+" "+mix);
    }
    public static void main(String[] args){
        operation("pushkaraj");
    }
}













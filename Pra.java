

// public class Pra{

//     static int binarySearch(int arr[],int ele){
//         int low=0;
//         int high=arr.length;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(arr[mid]==ele){
//                 return mid;
//             }
//             else if(arr[mid]<ele){
//                 low = mid+1;
//             }
//             else if(arr[mid]>ele){
//                 high=mid-1;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8,9};
//         int ele = 8;
//         System.out.println(binarySearch(arr,ele));
//     }
// }

// //  binary search algorithm   and added with recursion calling function




// Problem: Move the first character of the string to the end.
// Input: India
// Output: ndiaI
// class Pra{
//     static void firstToLast(String str){
//         if(str==null || str.trim().isEmpty()){
//             System.out.println("String is invalid");
//             return;
//         }
//         if(str.length()==1){
//             System.out.println(str);
//             return;
//         }
//         String result ="";
//         for(int i=1;i<str.length();i++){
//             result = result+str.charAt(i);
//         }
//         result=result+str.charAt(0);
//         System.out.println("result string :"+result);

//     }
//     public static void main(String[] args) {
//         firstToLast("abcd");
//     }
// }








// Problem: Move the last character of the string to the front.
// Input: India
// Output: aIndi


// class Pra{
//     static void lastToFirst(String str){
//         if(str==null || str.trim().isEmpty()){
//             System.out.println("string is invalid");
//             return;
//         }
//         if(str.length()==1){
//             System.out.println(str);
//             return;
//         }
//         char last =str.charAt(str.length()-1);
//         String result="";
//         result = result+last;
//         for(int i=0;i<str.length()-1;i++){
//             result=result+str.charAt(i);
//         }
//         System.out.println(result);
//     }
//     public static void main(String[] args){
//         lastToFirst("abcd");
//     }
// }




// Problem: Swap the first and last characters of the string.
// Input: India
// Output: andiI


// class Pra{
//     static void swap(String str){
//         if(str==null || str.trim().isEmpty()){
//             System.out.println("string is invalid");
//             return;
//         }
//         if(str.length()==1){
//             System.out.println(str);
//         }
//         String result = "";
//         char first = str.charAt(0);
//         char last = str.charAt(str.length()-1);
//         result = result + last;
//         String rest = "";

//         for(int i=1;i<str.length()-1;i++){
//             rest = rest + str.charAt(i);
//         }
//         result = result+  rest + first;
//         System.out.println(result);
//     }
// public static void main(String[] args){
//         swap("abcd");
//     }
// }




// Problem: Count the number of vowels in the string.
// Input: Education

// class Pra{
//     static void countVowels(String str){
//         int count=0;
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if("aeiouAEIOU".indexOf(ch) != -1){
//                 count++;
//             }
//         }
//         System.out.println(count);
//     }
//     public static void main(String[] args) {
//         countVowels("Education");
//     }
// }







// Problem: Replace vowels with the order they appear.
// Input: International
// Output: 1nt2rn3t45n6l

// class Pra{
//     static void replaceVowelsWithNum(String str){
//         int count=0;
//         String result = "";
//         for(int i=0;i<str.length();i++){
//             char ch=str.charAt(i);
//             if("aeiouAEIOU".indexOf(ch)!=-1){
//                 count++;
//                 result = result + count;
//             }
//             else{
//                 result = result + ch;
//             }
//         }
//         System.out.println(result);
//     }
//     public static void main(String[] args) {
//         replaceVowelsWithNum("International");
//     }
// }




// Problem: Replace vowels (right to left) with the order they appear.
// Input: International
// Output: 6nt5rn4t32n1l

// class Pra{
//     static void replaceVowels(String str){
//         int count = 0;
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if("aeiouAEIOU".indexOf(ch)!=-1){
//                 count++;
//             }
//         }

//         String result = "";
//         for(int j=0;j<str.length();j++){
//             char ch =str.charAt(j);
//             if("aeiouAEIOU".indexOf(ch)!=-1){
//                 result = result + count;
//                 count--;
//             }
//             else{
//                 result = result + ch;
//             }
//         }
//         System.out.println(result);
//     }
//     public static void main(String[] args) {
//         replaceVowels("International");
//     }
// }





// Problem: Separate consonants and vowels. Keep consonants in order and append sorted vowels.
// Input: International
// Output: ntrntnlAaeio

// import java.util.Arrays;
// class Pra{

//     static  void separateConsVowels(String str){
//         String consonants = "";
//         String vowels = "";

//         for(int i=0;i<str.length();i++){
//             char ch  = str.charAt(i);
//             if("aeiouAEIOU".indexOf(ch)!=-1){
//                 vowels = vowels + ch;
//             }
//             else{
//                 consonants = consonants + ch;
//             }
//         }

//         char[] arr = vowels.toCharArray();
//         Arrays.sort(arr);
//         vowels = new String(arr);
//         System.out.println(vowels);
//     }
//     public static void main(String[] args) {
//         separateConsVowels("International");
//     }
// }






// Problem: Sort characters of string alphabetically.
// Input: international
// Output: aaeiilnnnortt


// class Pra{
//     static void sortAlpha(String str){
//         char[] arr = str.toCharArray();
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i]>arr[j]){
//                     char temp = arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//                 str=new String(arr);
//                 System.out.println(str);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         sortAlpha("international");
//     }
// }




// Problem: Count the number of words in a sentence.
// Input: hello i am java developer
// Output: 5


// class Pra{
//     static void countWords(String str){
//         int count = 0;
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if(ch == ' '){
//                 count++;
//             }
//         }
//         System.out.println("number of words = "+count+1);
//     }
//     public static void main(String[] args) {
//         countWords("hello i am java developer");
//     }
// }












// Problem: Print the longest word in a sentence.
// Input: welcome to international airport
// Output: international



// class Pra{
//     static  void longestWord(String str){
//         String[] words = str.split(" ");
//         String longest = "";
//         for(String word : words){
//             if(word.length() > longest.length()){
//                 longest = word;
//             }
//         }
//         System.out.println(longest);
//     }
//     public static void main(String[] args) {
//         longestWord("welcome to international airport");
//     }
// }




// Problem: Sort all words in dictionary (alphabetical) order.
// Input: hello i am java developer
// Output: am developer hello i java 



class Pra{
    static void alpha(String str){
        String[] arr = str.split(" ");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i].compareTo(arr[j])>0){
                    String temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            for(String word : arr){
                System.out.println(word+" ");
            }
        }
    }
    public static void main(String[] args) {
        alpha("hello i am java developer");
    }
}






























































class Pra{
    public static void main(String[] args) {
        
    }
}

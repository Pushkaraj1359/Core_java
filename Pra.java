

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



// class Pra{
//     static void alpha(String str){
//         String[] arr = str.split(" ");
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i].compareTo(arr[j])>0){
//                     String temp = arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//             for(String word : arr){
//                 System.out.println(word+" ");
//             }
//         }
//     }
//     public static void main(String[] args) {
//         alpha("hello i am java developer");
//     }
// }


/*Problem: Sort words based on their length (shortest to longest).
Input: hello i am java developer
Output: i am java hello developer */

// class Pra{
//     static  void wordShort(String str){
//         String[] arr = str.split(" ");
//         for(int i=0;i<arr.length;i++){
//             for(int j=i+1;j<arr.length;j++){
//                 if(arr[i].length()>arr[j].length()){
//                     String temp = arr[i];
//                     arr[i]=arr[j];
//                     arr[j]=temp;
//                 }
//             }
//         }
//         for(String word : arr){
//             System.out.print(word+" ");
//         }
//     }
//     public static void main(String[] args) {
//         wordShort("hello i am java developer");
//     }
// }



/* Problem: Reverse each individual word in the sentence.

Input: hello i am java developer

Output: olleh i ma avaj repoleved */

// class Pra{
//     static void operation(String str){
//         String[] arr = str.split(" ");
//         for(int i=0;i<arr.length;i++){
//             String word = arr[i];
//             String reverse = "";
//             for(int j=word.length()-1;j>=0;j--){
//                 reverse =  reverse + word.charAt(j);
//             }
//             System.out.print(reverse+" ");
//         }
//     }
//     public static void main(String[] args){
//         operation("hello i am java developer");
//     }
// }



// Problem: Append word number (starting from 1) to each word.
// Input: hello i am java developer
// Output: hello1 i2 am3 java4 developer5

// class Pra{
//     static void operation(String str){
//         String[] arr = str.split(" ");
//         for(int i=0;i<arr.length;i++){
//             System.out.print(arr[i]+(i+1)+" ");
//         }
//     }
//     public static void main(String[] args) {
//         operation("hello i am java developer");
//     }
// }






// Problem: Add length of each word at the end of the word.
// Input: hello i am java developer
// Output: hello5 i1 am2 java4 developer9


// class Pra{
//     static void operation(String str){
//         String[] words = str.split(" ");
//         for(int i=0;i<words.length;i++){
//             System.out.println(words[i]+words[i].length());
//         }
//     }
//     public static void main(String[] args){
//         operation("hello i am java developer");
//     }

//     @Override
//     public String toString() {
//         return super.toString();
//     }
// }




// Problem: Move first character of every word to the end
// Input: hello i am java developer
// Output: elloh i ma avaj eveloperd



// class Pra{
//     static void operation(String str){
//         String[] words = str.split(" ");
//         for(int i=0;i<words.length;i++){
//             String word = words[i];
//             String rest = "";
//             char ch = word.charAt(0);
//             for(int j=1;j<word.length();j++){
//                 rest = rest + word.charAt(j);
//             }
//             String result = rest + ch;
//             System.out.print(result+" ");
//         }
//     }
//     public static void main(String[] args) {
//         operation("hello i am java developer");
//     }
// }




// Problem: Swap the first and last character of each word.
// Input: hello i am java developer
// Output: oellh i ma avaj revelopd
// (Note: Your example was a little off. The output should reflect actual swap.)



// class Pra{
//     static void operation(String str){
//         String[] words = str.split(" ");

//         for(int i=0;i<words.length;i++){
//             String word = words[i];

//             // below if block for in case word is single character then this block work well
//             if(word.length() <= 1){
//                 System.out.print(word + " ");
//                 continue;
//             }

//             char first = word.charAt(0);
//             char last = word.charAt(word.length()-1);
//             String mid ="";
//             for(int j=1;j<word.length()-1;j++){
//                 mid = mid + word.charAt(j);
//             }
//             String result = last + mid + first;
//             System.out.print(result+" ");
//         }
//     }
//     public static void main(String[] args) {
//         operation("hello i am java developer");
//     }
// }





// Problem: Remove the first letter of each word and append them at the end.
// Input: hello i am java developer
// Output: ello m ava eveloperhiajd


// class Pra{
//     static void operation(String str){
//         String[] words = str.split(" ");
//         String firstChars = "";
//         String rest = "";

//         for(int i=0;i<words.length;i++){
//             String word = words[i];
//             if(word.length()>1){
//                 firstChars = firstChars + word.charAt(0);
//                 rest = rest + word.substring(1);
//             }
//             else{
//                 firstChars = firstChars + word;
//             }
//         }
//         System.out.print(rest.trim()+firstChars+" ");
//     }
//     public static  void main(String[] args){
//         operation("hello i am java developer");
//     }
// }






// Problem: In each word, replace vowels with increasing count (starting from 1 per word).
// Input: hello i am java developer
// Output: h1ll2 1 1m j1v2 d1v2l3p4r


// class Pra{
//     static void operation(String str){
//         String[] words = str.split(" ");

//         for(int i=0;i<words.length;i++){
//             String word = words[i];
//             int count = 1;
//             String newString = "";
    

//             for(int j=0;j<word.length();j++){
//                 char ch = word.charAt(j);
//                 if("aeiouAEIOU".indexOf(ch) != -1){
//                     newString = newString + count;
//                     count++;
//                 }else{
//                     newString = newString + ch;
//                 }
//             }
//             System.out.print(newString+" ");
//         }
//     }
//     public static void main(String[] args){
//         operation("hello i am java developer");
//     }
// }




// Problem: Remove vowels from sentence and append them at end, preserving spaces.
// Input: hello i am java developer
// Output: hll  m jv dvlpr eoiaaaeeoe


// class Pra{
//     static void operation(String str){
//         String vowels = "";
//         String rest ="";

//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if("aeiouAEIOU".indexOf(ch) != -1){
//                 vowels = vowels + ch;
//             }
//             else{
//                 rest = rest + ch;
//             }
//         }
//         System.out.print(rest+" "+vowels);
//     }
//     public static void main(String[] args){
//         operation("hello i am java developer");
//     }
// }




// Q21. Capitalize First Letter of Each Word

// Problem: Capitalize the first letter of every word.
// Input: hello i am java developer
// Output: Hello I Am Java Developer



// class Pra{
//     static void operation(String str){
//         String[] words = str.split(" ");

//         String result = "";
//         for(int i=0;i<words.length;i++){
//             String word = words[i];
//             char firstChar = Character.toUpperCase(word.charAt(0));
//             String rest = word.substring(1);
//             result = result + firstChar + rest + " ";
//         }
//         System.out.print(result);
//     }
//     public static void main(String[] args){
//         operation("Hello I Am Java Developer");
//     }
// }




// Problem: Convert only the vowels to uppercase in the sentence.
// Input: hello i am java developer
// Output: hEllO I Am jAvA dEvElOpEr



// class Pra{
//     static void opetation(String str){
//         String[] words = str.split(" ");

//         for(int i=0;i<words.length;i++){
//             String word = words[i];
//             String newWord = "";

//             for(int j=0;j<word.length();j++){
//                 char ch = word.charAt(j);

//                 if("aeiouAEIOU".indexOf(ch) != -1){
//                     char op = Character.toUpperCase(ch);
//                     newWord = newWord + op;
//                 }
//                 else{
//                     newWord = newWord + ch;
//                 }
//             }
//             System.out.print(newWord+" ");
//         }
//     }
//     public static void main(String[] args){
//         operation("hello i am java developer");
//     }
// }




// Problem: Count characters that are neither letters nor digits nor spaces.
// Input: hello? where are you!! i am fine!! thank you,.

// class Pra{
//     static void operation(String str){
//         int count = 0 ;
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if(!Character.isDigit(ch) && !Character.isLetter(ch) && ch != ' '){
//                 count++;
//             }
//         }
//         System.out.print(count);
//     }

//     public static void main(String[] args){
//         operation("Input: hello? where are you!! i am fine!! thank you,.");
//     }
// }



// Problem: Remove all special characters, keeping letters, digits, and spaces only.
// Input: hello? where are you!! i am fine!! thank you,.
// Output: hello where are you i am fine thank you


// class Pra{
//     static void operation(String str){
//         String result = "";
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if(Character.isDigit(ch) || Character.isLetter(ch) || ch == ' '){
//                 result = result + ch;
//             }
//         }
//         System.out.print(result);
//     }
//     public static void main(String[] args){
//         operation("hello? where are you!! i am fine!! thank you,.");
//     }
// }






// class Pra{
//     static void operation(String str){
//         String zeros = "";
//         String ones = "";
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if(ch == 0){
//                 zeros = zeros + ch;
//             }
//             else{
//                 ones = ones + ch;
//             }
//         }
//         String result  = zeros + ones;
//         System.out.print(result);
//     }
//     public static void main(String[] args) {
//         operation("0101010101");
//     }
// }








// class Pra{
//     static void operation(String str){
//         String original = str ;
//         String reverse = "";

//         for(int i=str.length()-1;i>=0;i--){
//             char  ch = str.charAt(i);
//             reverse = reverse + ch;
//         }
//         if(original.equals(reverse)){
//             System.out.println("string is palindrome :"+str);
//         }else{
//             System.out.println("string is not palindrome :"+str);
//         }
//     }
//     public static void main(String[] args) {
//         operation("ABA");
//     }
// }




// Toggle case

// class Pra{
//     static void operation(String str){
//         String result ="";
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             result += Character.isLowerCase(ch) ? Character.toUpperCase(ch) : Character.toLowerCase(ch);
//         }
//         System.out.println(result);
//     }
//     public static void main(String[] args){
//         operation("abcdABCD");
//     }
// }


// class Pra{
//     static void operation(String str){
//         String result = "";
//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if(Character.isLowerCase(ch)){
//                 result += Character.toUpperCase(ch);
//             }else{
//                 result += Character.toLowerCase(ch);
//             }
//         }
//         System.out.print(result);
//     }
//     public static void main(String[] args){
//         operation("abcdABCD");
//     }
// }







// Count vowels and consonants


// class Pra{
//     static void operation(String str){
//         int v = 0;
//         int c = 0;
//         for(char ch : str.toCharArray()){
//             if(Character.isLetter(ch)){
//                 if("aeiouAEIOU".indexOf(ch) != -1)  v++;
//                 else c++;
//             }
//         }
//         System.out.println("vowels :"+v +" "+ "consonants:" +c);
//     }
//     public static void main(String[] args){
//         operation("aEbbb");
//     }
// }






// Remove special characters


// class Pra{
//     static void operation(String str){
//         String result = "";
//         for(char ch : str.toCharArray()){
//             if(Character.isLetterOrDigit(ch)){
//                 result = result + ch;
//             }   
//         }
//         System.out.print(result);
//     }
//     public static void main(String[] args) {
//         operation( "a1@b2#c3");
//     }
// }








// Reverse only letters

// class Pra{
//     static void operation(String str){
//         String letters = "";
//         String result = "";
//         for(char ch : str.toCharArray()){
//             if(Character.isLetter(ch)){
//                 letters = ch + letters;
//             }
//         }
//         int j = 0;
//         for(char ch : str.toCharArray()){
//             if(Character.isLetter(ch)){
//                 result = result + letters.charAt(j++);
//             }else{
//                 result = result + ch;
//             }
//         }
//         System.out.print(result);
//     }
//     public static void main(String[] args){
//         operation("a1b2c3");
//     }
// }


// . Count alphabets, digits, special
// class Pra{
//     static void operation(String str){
//         char[] chars = str.toCharArray();
//         int c= 0 , d =0 ,s=0;
//         for(int i=0;i<chars.length;i++){
//             char ch = chars[i];
//             if(Character.isLetter(ch)){
//                 c++;
//             }
//             else if(Character.isDigit(ch)){
//                 d++;
//             }
//             else{
//                 s++;
//             }
//         }
//         System.out.print(s+" "+c+" "+d);
//     }
//     public static void main(String[] args){
//         operation("a1@b2");
//     }
// }



// count the number of words
// class Pra{
//     static void operation(String str){
//         String[] words = str.split(" ");
//         System.out.println(words.length);
//     }
//     public static void main(String[] args) {
//         operation("i love java");
//     }
// }





// reverse string

// class Pra{
//     static void operation(String str){
//         String reverse = "";
//         for(int i=str.length()-1;i>=0;i--){
//             reverse = reverse + str.charAt(i);
//         }
//         System.out.println(reverse);
//     }

//     public static void main(String[] args) {
    //         operation("abcd");
    //     }
    // }
    
    
    
    
    
    // Palindrome
    
    // class Pra{
    //     static void operation(String str){
    //         String original =str;
    //         String reverse = "";
    //         char[] chars = str.toCharArray();
    //         for(int i=chars.length-1;i>=0;i--){
    //             reverse = reverse + chars[i];
    //         }
    //         if(original.equals(reverse)){
    //             System.out.println("string is palindrome :");
    //         }else{
    //             System.out.println("String is not palindrime :");
    //         }
    //     }

    //     public static void main(String[] args) {
    //         operation("madam");
    //     }
    // }



    // reverse sentance 


    // class Pra{
    //     static void operation(String str){
    //         String output ="";
    //         String[] words = str.split(" ");
    //         for(int i=words.length-1;i>=0;i--){
    //             output = output + words[i]+" ";
    //         }
    //         System.out.println(output.trim());
    //     }
    //     public static void main(String[] args) {
    //         operation("hello , pushkaraj");
    //     }
    // }



    // All occurrences count

    // class Pra{
    //     static void operation(String str){
    //         char[] chars = str.toCharArray();
    //         int count = 0;
    //         for(int i=0;i<chars.length;i++){
    //             char ch = chars[i];
    //             if(ch == 'a'){
    //                 count++;
    //             }
    //         }
    //         System.out.print(count);

    //     }
    //     public static void main(String[] args) {
    //         operation("aabacd");
    //     }
    // }


    // All occurrences

    // class Pra{
    //     static void operation(String str){
    //         char[] chars = str.toCharArray();
    //         for(int i=0;i<chars.length;i++){
    //             char ch = chars[i];
    //             if(ch == 'a'){
    //                 System.out.print(ch+" ");
    //             }
    //         }
    //     }
    //     public static void main(String[] args) {
    //         operation("aabacd");
    //     }
    // }






    // Highest frequency
    

    // class Pra{
    //     static void operation(String str){
    //         int max  = 0;
    //         char res = ' ';
    //         for(int i=0;i<str.length();i++){
    //             char ch1 = str.charAt(i);
    //             int count = 0;
    //             for(int j=0;j<str.length();j++){
    //                 char ch2 = str.charAt(j);
    //                 if(ch1 == ch2){
    //                     count++;
    //                 }
    //             }
    //             if(count > max){
    //                 max = count;
    //                 res = str.charAt(i);
    //             }
    //         }
    //         System.out.println(max+" "+res);
    //     }
    //     public static void main(String[] args) {
        //         operation("bbcsaaa");
        //     }
        // }


    



    
        
        // class Pra{
        //     static void operation(String str){
        //         int min =  str.length();
        //         char res = ' ';
        //         for(int i=0;i<str.length();i++){
        //             char ch1 = str.charAt(i);
        //             int count = 0;
        //             for(int j=0;j<str.length();j++){
        //                 char ch2 = str.charAt(j);
        //                 if(ch1==ch2){
        //                     count++;
        //                 }
        //             }
        //             if(count<min){
        //                 min = count;
        //                 res = str.charAt(i);
        //             }
        //         }
        //         System.out.print(min +" ----> "+res);
        //     }
        //     public static void main(String[] args) {
        //         operation("bbccdaaaaa");
        //     }
        // }


        // class Pra{
        //     static void operation(String str){
        //         String zeros = "";
        //         String res = "";
        //         for(char ch  : str.toCharArray()){
        //             if(ch=='0'){
        //                 zeros += ch;
        //             }else{
        //                 res +=ch;
        //             }
        //         }
        //         String result = res + zeros; 
        //         System.out.println(result);
        //     }
        //     public static void main(String[] args) {
        //         operation("1240356090");
        //     }
        // }







// Problem statement : input vaibhav   output v2a2i1b1h1



class Pra{
    static void operation(String str){

        // Method 01
        // char[] ch = str.toCharArray();
        // boolean[] visited = new boolean[256];
        // int[] count = new int[256];
        // for(int i = 0; i<ch.length; i++){
        //     count[ch[i]]++;
        
        // for(int j = 0; j<ch.length; j++){
        //     if(ch[i]==ch[j]){
        //         System.out.println(ch[i]);
        //         System.out.println(count[ch[i]]);
        //         visited[ch[i]]=true;

        //     }
        // }





        // method 02

        int[] freq = new int[256];
        
        // count frequency 
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch]++;
        }

        // print without duplicate
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(freq[ch] != 0){
                System.out.print(ch+" "+freq[ch]);
                freq[ch]=0;
            }
        }
    }
    public static void main(String[] args) {
        operation("vaibhav");
    }
}








// class Pra{
//     static void operation(String str){
//         int[] freq = new int[256];

//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             freq[ch]++;
//         }


//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if(freq[ch] != 0){
//                 System.out.print(ch+" "+freq[ch]);
//                 freq[ch] = 0;

//             }
//         }
//     }

//     public static void main(String[] args){
//         operation("vaibhav");
//     }
// }



// minimum frequence + perticular character print

class Pra{
    static void operation(String str){
        int min = str.length()-1;
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
            if(min>count){
                min = count;
                res = str.charAt(i);
            }
        }
        System.out.print(res+" "+min);
    }
    public static void main(String[] args){
        operation("pushkaraj");
    }
}



// mixmum frequence + perticular character print

// class Pra{
//     static void operation(String str){
//         int mix = 0;
//         char res = ' ';

//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);



//             boolean visited = false;
//             for(int k = 0; k < i; k++) {
//                 if(str.charAt(k) == ch) {
//                     visited = true;
//                     break;
//                 }
//             }
//             if(visited) continue;





//             int count = 0;
//             for(int j=0;j<str.length();j++){
//                 char ch1 = str.charAt(j);
//                 if(ch==ch1) count++;
                
//             }
//             if(count>mix){
//                 mix=count;
//                 res = str.charAt(i);
//             }
//         }
//         System.out.print(mix+" "+res);
//     }
//     public static void main(String[] args){
//         operation("aaabbc");
//     }
// }




// class Pra{
//     static void operation(String str){
//         int[] freq = new int[256];

//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             freq[ch]++;
//         }


//         for(int i=0;i<str.length();i++){
//             char ch = str.charAt(i);
//             if(freq[ch] != 0){
//                 System.out.println(ch+" "+freq[ch]);
//                 freq[ch] = 0;
//             }
//         }
//     }
//     public static void main(String args){
//         operation("aaabbc");
//     }
// }























































class Pra{
    public static void main(String[] args) {
        
    }
}

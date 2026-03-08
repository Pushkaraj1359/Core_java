// Q8. Sort All Characters Alphabetically

// Problem: Sort characters of string alphabetically.
// Input: international
// Output: aaeiilnnnortt



package stringQuestions;

public class Program08 {
    public static void main(String[] args) {
        // String str = "international";
        // char[] arr = str.toCharArray();
        
        // Arrays.sort(arr);
        // str = new String(arr);
        // System.out.println(str);
        
        // String str = "international";
        // char[] arr = str.toCharArray();

        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]>arr[j]){
        //             char temp = arr[i];
        //             arr[i]=arr[j];
        //             arr[j] = temp;
        //         }
        //     }
        // }
        // str = new String(arr);
        // System.out.println(str);

        String str = "yaj";
        char[] arr =str.toCharArray();

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp ;
                }
            }
        }
        str = new String(arr);
        System.out.println(str);
    }
}




/* This program sorts the characters of a string in alphabetical order without using any built-in method.

First, the string is converted into a character array because strings in Java are immutable. Then, two nested loops are used to compare each character with the remaining characters. If a character has a greater ASCII value than the next one, they are swapped using a temporary variable.

This process continues until all characters are arranged in ascending order.

The logic is similar to Selection Sort, and its time complexity is O(n²). */
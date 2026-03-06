// Q23. Sum All Digits in the String

// Problem: Find the sum of digits in the string.
// Input: welcome to 2024
// Output: 8 (2 + 0 + 2 + 4)



package stringQuestions;

public class Program23 {
    public static void main(String[] args) {
    
    // Method 01
        String str = "welcome to 2024";
        int sum = 0;
        
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
        
            if(Character.isDigit(ch)) {
                sum = sum + (ch - '0');
            }
        }
        
        System.out.println(sum);
        

    // Method 02
        // String str = "welcome to 2024";
        // int sum = 0;
        
        // for(char ch : str.toCharArray()) {
        //     if(Character.isDigit(ch)) {
        //         sum += Character.getNumericValue(ch);
        //     }
        // }
        
        // System.out.println(sum);
        
    }
}






// sum = sum + (ch - '0');

// Why (ch - '0')?

// Because:

// Character '2' ASCII value is 50

// Character '0' ASCII value is 48

// 50 - 48 = 2 ✔

// So we convert character digit → integer digit.
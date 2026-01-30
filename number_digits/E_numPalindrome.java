package number_digits;

public class E_numPalindrome {
    static void palindrome(int num){
        int reverse = 0;
        int original = num;
        while(num>0){
            int digit = num % 10;
            reverse = reverse * 10 + digit ;
            num = num / 10;
        }
        if(reverse==original){
            System.out.println("this is an palindrome");
        }else{
            System.out.println("this is not an palindrome : ");
        }
    }
    public static void main(String[] args) {
        // int number =121;
        // int original = number; 
        // int reverse = 0;
        // while(number>0){
        //     int digit = number % 10;
        //     reverse = reverse * 10 + digit;
        //     number = number / 10;
        // }
        // if(original == reverse){
        // System.out.print("this number is palindrome");
        // }
        // else{
        // System.out.print("this number is not palindrome");
        // }
        int num = 121;
        palindrome(num);
    }
}


        

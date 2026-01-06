package number_digits;

public class E_numPalindrome {
    public static void main(String[] args) {
        int number =121;
        int original = number; 
        int reverse = 0;
        while(number>0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        if(original == reverse){
        System.out.print("this number is palindrome");
        }
        else{
        System.out.print("this number is not palindrome");
        }
    }
}


        

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
public class Sum{
    static int checkPlindrome(int number){
        int reverse = 0;
        while(number > 0 ){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
    
    int number = 121;
    int original = number;
    int result = checkPlindrome(number);
    if (result == original){
        System.out.println("this is an palindrome");
    }
    else{
        System.out.println("this is an not palindrome");
    }
    System.out.println("this is an original number"+original);
    System.out.println("this is an reverse number "+result);
    }
}
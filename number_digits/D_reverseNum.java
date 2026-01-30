package number_digits;

public class D_reverseNum {
    static int reverseDigit(int num){
        int reverse = 0;
        while(num>0){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(reverseDigit(num));
    }
}              



package number_digits;

public class K_appendSum {
    public static void main(String[] args) {
        int num = 123;
        int temp = num;
        int sum = 0 ;
        while(num>0){
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }
        int digitCount=String.valueOf(sum).length();
        int resuit = temp * (int)Math.pow(10, digitCount)+sum;
        System.out.println(resuit);
    }
}
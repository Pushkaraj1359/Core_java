package number_digits;

public class C_sumOfDigit{
    static int countSum(int num){
        int sum = 0;
        while(num>0){
            int temp = num % 10;
            sum = sum + temp;
            num = num /10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int num = 1234;
        System.out.println(countSum(num));
    }
}
package number_digits;

public class K_appendSum {
    public static void main(String[] args) {
        int number = 1234;
        int tem = number;
        int sum = 0;

        while(number>=1){
            int digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }
        int resuit = tem * 100 + sum;
        System.out.print(resuit);
    }
}
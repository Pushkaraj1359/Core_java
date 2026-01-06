package number_digits;

public class A_CountNumDigits {
    public static void main(String[] args) {
        int num = 6288;
        int count=0;
        while(num>0){
            num = num / 10;
            count++;
        }
        System.out.print(count);
    }
}

package number_digits;

public class B_firstLastDigit {
    public static void main(String[] args) {
        int number = 12345;
        int lastDigit = number % 10;
        System.out.println("last digit is "+lastDigit);

        int firstDigit = number;
        while(firstDigit>=10){
            firstDigit = firstDigit / 10;
        }
        System.out.println("First digit is "+firstDigit);
        
        int sum = firstDigit+lastDigit;
        System.out.print("the sum of first and last digit is ="+sum);
    }
}

package number_digits;
import java.util.Scanner;


public class J_hcf {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("enter value for a");
        int a = scanner.nextInt();

        System.out.println("enter value for b");
        int b = scanner.nextInt();
        // int a=8;
        // int b=12;
        int hcf=1;

        for(int i=1;i<=a && i<=b;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        System.out.println("the HCF IS = "+hcf);
    }
}

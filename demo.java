import java.util.Scanner;
public class demo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nums");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int i = 1;
        int hcf = 1;

        while(i<=a && i<=b){
            if (a%i==0 && b%i==0) {
                hcf = i;           
            }

            i++;
        }

        System.out.println("Hcf of" +a+"&"+b+":"+hcf);

        int lcm = (a*b)/hcf;
        System.out.println("Lcm of" +a+"&"+b+":"+lcm);
        
        }
}

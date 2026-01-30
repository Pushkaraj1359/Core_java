// import java.util.Scanner;
// public class Power {
//     public static void main(String[] args){
//         int base;
//         int exponent;

//         Scanner scanner = new Scanner(System.in);

//         System.out.println("please enter the base value");
//         base = scanner.nextInt();

//         System.out.println("please enter the exponent value");
//         exponent = scanner.nextInt();

//         int result = 1;
//         for(int i=1;i<=exponent;i++){
//             result = result * base;
//         }
//         System.out.println(result);
//     }
// }

import java.util.*;
class Power{
    static int calPower(int base, int exponent){
        int result = 1;
        for(int i = 1; i<=4; i++){
            result= result* base;
        }
        return result;
    }
    public static void main(String[] args){
        int base = 3;
        int exponent = 4;
        int power= calPower(base,exponent);
        System.out.println("the base value is = "+ base);
        System.out.println("the exponent value is = "+exponent);
        System.out.println("the power of this base and exponent is = "+ power);

    }
}

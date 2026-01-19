// package number_digits;

// public class A_CountNumDigits {
//     public static void main(String[] args) {
//         int num = 6288;
//         int count=0;
//         while(num>0){
//             num = num / 10;
//             count++;
//         }
//         System.out.print(count);
//     }
// }




// package number_digits;

// import java.util.Scanner;

// public class A_CountNumDigits {
//     static int countNum(int num){
//         int count = 0;
//         while(num>0){
//             num = num / 10;
//             count++;
//         }
//         return count;

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("enter any number");
//         int num = sc.nextInt();
//         countNum(num);
//         System.out.println("the enter num lenght ="+countNum(num));
//     }
// }


package number_digits;
import java.util.Scanner;

public class A_CountNumDigits {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println("enter any number");
        int num = sr.nextInt();
        for(int i=1;i<=10;i++){
            int resuit = num * i;// 10*1=10
            System.out.println(num+ " * "+ i+" = " +resuit);



        }
    }
}























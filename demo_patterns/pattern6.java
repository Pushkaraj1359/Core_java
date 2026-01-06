// PACKAGE
// ****
//  ***
//   **
//    *


// using loop
// package demo_patterns;
// public class pattern6 {
//     public static void main(String[] args) {
//         int n = 5;
//         for(int i=n;i>=1;i--){
//             // space print ---> inner loop 
//             for(int space=1;space<=n-i;space++){
//                 System.out.print(" ");
//             }
//             // star print ---> inner loop 
//             for(int star=1;star<=i;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// using function calling
package demo_patterns;

public class pattern6 {

    static void pattern(int n){
        for(int i=n;i>=1;i--){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n=4;
        pattern(n);

    }
}
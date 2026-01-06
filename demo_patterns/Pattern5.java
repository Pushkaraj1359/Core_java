// PATTERN
//      *
//     **
//    ***
//   ****


// package demo_patterns;

// public class Pattern5 {
//     public static void main(String[] args){

//         for(int i=1;i<=4;i++){
//             // inner loop ---> space print
//             for(int j=1;j<=4-i;j++){
//                 System.out.print(" ");
//             }

//             //  inner loop ---> space print
//             for(int j=1; j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// using Function
// package demo_patterns;
// public class Pattern5 {
//     static void pattern(int i, int j){
//         for(i=1;i<=4;i++){
//             for(j=1;j<=4-i;j++){
//                 System.out.print(" ");
//             }
//             for(j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
//     public static void main(String[] args){
//         int i=4;
//         int j=4;
//         pattern(i,j);
//     }
// }




//----------------------------Another Pattern code---------------------------

// PATTERN
//    * 
//   * * 
//  * * * 
// * * * * 

// package demo_patterns;

// public class Pattern5 {
//     public static void main(String[] args){

//         for(int i=1;i<=4;i++){
//             // space print ---> inner loop
//             for(int space=1;space<=4-i;space++){
//                 System.out.print(" ");
//             }
//             // star print ---> inner loop
//             for(int star=1;star<=i;star++){
//                 System.out.print("* "); // JUST FOCUS ON "* " * after one face both code are some
//             }
//             System.out.println();
//         }
//     }
// }


//------------------Another Pattern code-----------------------
// $$$$*
// $$$**
// $$***
// $****
// *****


// package demo_patterns;

// public class Pattern5 {
//     public static void main(String[] args){

//         for(int i=1;i<=5;i++){
//             for(int space=1;space<=5-i;space++){
//                 System.out.print("$");
//             }
//             for(int star=1;star<=i;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



//------------------Another Pattern code-----------------------

// ___*
// __***
// _*****
// *******
// package demo_patterns;

// public class Pattern5 {
//     public static void main(String[] args){

//         int n=4;
//         for(int i=1;i<=n;i++){
//             for(int space=3;space>=i;space--){
//                 System.out.print("_");
//             }
//             for(int j=1;j<=2*i-1;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }



// ___*
// __***
// _*****
// *******
package demo_patterns;

public class Pattern5 {
    public static void main(String[] args){

        // int n=5;
        // for(int i=1;i<=4;i++){
        //     for(int j=i;j<=n;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<i;j++){
        //         System.out.print("*");
        //     }
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }


        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=3;j>=i;j--){
                System.out.print("_");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}




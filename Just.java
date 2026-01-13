// *****
// *****
// *****
// *****
// *****

// public class Just {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//---------------->>>>>>>>>>>>>>
// *****
// *   *
// *   *
// *   *
// *****

// public class Just {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=5;j++){
//                 if(i==1 || j==1 || i==5 || j==5){
//                     System.out.print("*");
//                 }
//                 else{
//                     System.out.print(" ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

//---------------->>>>>>>>>>>>>>

// *
// **
// ***
// ****
// *****
// public class Just {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


//---------------->>>>>>>>>>>>>>
// *****
// ****
// ***
// **
// *
// public class Just {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int j=5;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//---------------->>>>>>>>>>>>>>
//     *
//    **
//   ***
//  ****
// *****
// public class Just {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int space=1;space<=5-i;space++){
//                 System.out.print(" ");
//             }
//             for(int star=1;star<=i;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//---------------->>>>>>>>
// *****
//  ****
//   ***
//    **
//     *
// public class Just {
//     public static void main(String[] args){
//         for(int i=5;i>=1;i--){
//             for(int space=1;space<=5-i;space++){
//                 System.out.print(" ");
//             }
//             for(int star=1;star<=i;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//---------------->>>>>>>>
//     *****
//    *****
//   *****
//  *****
// *****
// public class Just {
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int space=1;space<=5-i;space++){
//                 System.out.print(" ");
//             }
//             for(int star=1;star<=5;star++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

//---------------->>>>>>>>
//     * 
//    * *
//   * * *
//  * * * *
// * * * * *

// public class Just { 
//     public static void main(String[] args){
//         for(int i=1;i<=5;i++){
//             for(int space=1;space<=5-i;space++){
//                 System.out.print(" ");
//             }

//             for(int star=1;star<=i;star++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }



// *
// **
// ***
// ****
// *****
// ****
// ***
// **
// *
// public class Just { 
//     public static void main(String[] args){
//         int n = 5;
//         for(int i=1;i<=n*2-1;i++){
//             if(i<=n){
//                 for(int j=1;j<=i;j++){
//                     System.out.print("*");
//                 }
//             }
//             else{
//                 int c = (2*n)-i;
//                 for(int j=c;j>=1;j--){
//                     System.out.print("*");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// 1
// 22
// 333
// 4444
// 55555
// 4444
// 333
// 22
// 1
// public class Just { 
//     public static void main(String[] args){
//         int n =5;
//         for(int i=1;i<=(2*n)-1;i++){
//             if(i<=n){
//                 for(int j=1;j<=i;j++){
//                     System.out.print(i);
//                 }
//             }
//             else{
//                 int c = (n*2)-i;
//                 for(int j=c;j>=1;j--){
//                     System.out.print(c);
//                 }
//             }
//             System.out.println();
//         }
//     }
// }


public class Just { 
    public static void main(String[] args){
        int n=5;
        for( int i=1;i<=(n*2)-1;i++){
            if (i<=n) {
                for(int j=1;j<=i;j++){
                    System.out.print(i);
                }
            }
            else{
                int c = (n*2)-i;
                for( int j=c;j>=1;j--){
                    System.out.print(c);
                    c--;
                }
            }
        System.out.println();
        }
    }
}










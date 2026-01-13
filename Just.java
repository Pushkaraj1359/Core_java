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



// 1
// 21
// 321
// 4321
// 54321
// 4321
// 321
// 21
// 1
// public class Just { 
//     public static void main(String[] args){
//         int n=5;
//         for( int i=1;i<=(n*2)-1;i++){
//             if (i<=n) {
//                 int c = i;
//                 for(int j=1;j<=i;j++){
//                     System.out.print(c);
//                     c--;
//                 }
//             }
//             else{
//                 int c = (n*2)-i;
//                 for( int j=c;j>=1;j--){
//                     System.out.print(c);
//                     c--;
//                 }
//             }
//         System.out.println();
//         }
//     }
// }



// 5
// 54
// 543
// 5432
// 54321
// 5432
// 543
// 54
// 5
// public class Just { 
//     public static void main(String[] args){
//         int n =5;
//         for(int i=1;i<=(n*2)-1;i++){
//             if(i<=n){
//                 int c = n;
//                 for(int j=1;j<=i;j++){
//                     System.out.print(c);
//                     c--;
//                 }
//             }
//             else{
//                 int b = n;
//                 for(int j=(n*2)-i;j>=1;j--){
//                     System.out.print(b);
//                     b--;
//                 }
//             }
//             System.out.println();
//         }
//     }
// }





// 5
// 45
// 345
// 2345
// 12345
// 2345
// 345
// 45
// 5
// public class Just { 
//     public static void main(String[] args){
        
//         int n = 5;
//         for(int i=1;i<=(2*n)-1;i++){
//             if(i<=n){
//                 int c = n-i+1;
//                 for(int j=1;j<=i;j++){
//                     System.out.print(c);
//                     c++;
//                 }
//             }
//             else{
//                 int b = i - n + 1;
//                 for(int j=1;j<=(2*n)-i;j++){
//                     System.out.print(b);
//                     b++;
//                 }
//             }
//             System.out.println();
//         }
//     }
// }



// A
// bb
// CCC
// dddd
// EEEEE
// dddd
// CCC
// bb
// A

public class Just { 
    public static void main(String[] args){
        int n = 5;
        for(int i=1;i<=(2*n)-1;i++){
            if(i<=n){
                for(int j=1;j<=i;j++){
                    if(i%2!=0){
                        System.out.print((char)(i+64));
                    }
                    else{
                        System.out.print((char)(i+96));
                    }
                }
                System.out.println();
            }
            else{
                int c = (2*n)-i;
                for(int j=1;j<=(n*2)-i;j++){
                    if(i%2!=0){
                        System.out.print((char)(c+64));
                    }
                    else{
                        System.out.print((char)(c+96));
                    }
                }
                System.out.println();
            }
        }
    }
}












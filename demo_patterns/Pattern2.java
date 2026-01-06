
// Print below Pattern
// *****
// *   *
// *   *
// *****


package demo_patterns;
public class Pattern2 {
    public static void main(String[] args){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=5;j++){
                if(i==1 || j==5 || i==4 || j==1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}



// using function  

// package demo_patterns;
// public class Pattern2{
//         static void pattern(int i, int j){
//             for(i=1;i<=4;i++){
//                 for(j=1;j<=5;j++){
//                     if(i==1 || j==5 || i==4 || j==1){
//                         System.out.print("*");
//                     }
//                     else{
//                         System.out.print(" ");
//                     }
//                 }
//                 System.out.println();
//             }
//         }

//     public static void main(String[] args){
//         int i=4;
//         int j=5;
//         pattern(i,j);
//     }
// }




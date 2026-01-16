// 1 
// 2 6
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15

package number_patterns;
public class Pattern18 {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++){
            int p = i;
            for(int j=1;j<=i;j++){
                System.out.print(p+" ");
                p=p+n-j;
            }
            System.out.println();
        }
    }   
}


// 1 
// 3 2
// 6 5 4
// 10 9 8 7
// 15 14 13 12 11

// package number_patterns;
// public class Pattern18 {
//     public static void main(String[] args){
//         int n=5;
//         int count = 0;
//         for(int i=1;i<=n;i++){
//             count = count + i;
//             int temp=count;
//             for(int j=1;j<=i;j++){
//                 System.out.print(temp--);
//             }
//             System.out.println();
//         }
//     }
// }

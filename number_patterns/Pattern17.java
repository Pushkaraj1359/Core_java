// 54321
//  4321
//   321
//    21
//     1

package number_patterns;

public class Pattern17 {
    public static void main(String[] args) {
        int n =5;
        for(int i=n,k=n;i>=1;i--,k--){
            int p=k;
            // print spaces
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(p--);
            }
            System.out.println();
        }
    }
}

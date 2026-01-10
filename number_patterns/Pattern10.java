// 888888888
//  6666666
//   44444
//    222
//     0

package number_patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int n= 5;
        for(int i=n,p=8;i>=1;i--,p-=2){
            // print space
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(p);
            }
            for(int j=1;j<i;j++){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}

// 88888
//  6666
//   444
//    22
//     0

package number_patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int n=5;
        for(int i=5,p=8;i>=1;i--,p-=2){
            // space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}

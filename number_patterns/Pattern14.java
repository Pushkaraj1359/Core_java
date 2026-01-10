// 12345
//  1234
//   123
//    12
//     1

package number_patterns;

public class Pattern14 {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1,p=1;j<=i;j++,p++){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}

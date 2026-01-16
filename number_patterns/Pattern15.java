//     1
//    123
//   12345
//  1234567
// 123456789

package number_patterns;

public class Pattern15 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=5;i++){
            int p=1;
            // print space
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(p++);
            }
            for(int j=1;j<i;j++){
                System.out.print(p++);
            }
            System.out.println();
        }
    }
}

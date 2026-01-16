//     0
//    222
//   44444
//  6666666
// 888888888

package number_patterns;

public class Pattern9 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1,p=0;i<=n;i++,p+=2){
            // print spaces
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print(p);
            }

            for(int j=1;j<i;j++){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}

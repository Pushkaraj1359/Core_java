// 111111111
//  0000000
//   11111
//    000
//     1

package number_patterns;

public class Pattern13 {
    public static void main(String[] args) {
        int n=5;
        for(int i=5;i>=1;i--){
            for(int space=1;space<=n-i;space++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                if(i%2==0){
                    System.out.print("0");
                }else{
                    System.out.print("1");
                }
            }
            for(int j=1;j<i;j++){
                if(i%2==0){
                    System.out.print(0);
                }else{
                    System.out.print(1);
                }
            }
            System.out.println();
        }
    }
}

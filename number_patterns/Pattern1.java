// 1
// 11
// 111
// 1111
// 11111

package number_patterns;

public class Pattern1 {
    public static void main(String[] args) {
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("1");
            }
            System.out.println();
        }
    }
}

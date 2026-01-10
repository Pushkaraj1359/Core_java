// 5
// 54
// 543
// 5432
// 54321

package number_patterns;

public class Pattern16 {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1,p=n;j<=i;j++,p--){
                System.out.print(p);
            }
            System.out.println();
        }
    }
}

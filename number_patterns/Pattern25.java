// 15
// 14      10
// 13      9       6
// 12      8       5       3
// 11      7       4       2       1

package number_patterns;

public class Pattern25 {
    public static void main(String[] args) {
        int n = 5;
        int count = 15;
        int value = n-1;
        for(int i=1;i<=n;i++){
            int c = count;
            for(int j=1;j<=i;j++){
                System.out.print(c+"\t");
                c = c - value;
                value--;
            }
            value = n-1;
            count--;
            System.out.println();
        }
    }
}

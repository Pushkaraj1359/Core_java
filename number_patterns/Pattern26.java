// 11
// 12      7
// 13      8       4
// 14      9       5       2
// 15      10      6       3       1

package number_patterns;

public class Pattern26 {
    public static void main(String[] args) {
        int n = 5;
        int value = n*(n+1)/2;
        int count = value - (n-1);
        for(int i=1;i<=n;i++){
            int c = count;
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c = c - n;
                n--;
            }
            n=5;
            count++;
            System.out.println();
        }
    }
}

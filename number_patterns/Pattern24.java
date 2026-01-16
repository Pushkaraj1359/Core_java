// 5 
// 4 9
// 3 8 12
// 2 7 11 14
// 1 6 10 13 15

package number_patterns;

public class Pattern24 {
    public static void main(String[] args) {
        int n = 5;
        int value = n*(n+1)/2;
        int count = value - (2*n);
        for(int i=1;i<=n;i++){
            int c = count;
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c = c + n;
                n--;
            }

            n = 5;
            count--;
            System.out.println();
        }
    }
}

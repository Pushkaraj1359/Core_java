// 1 
// 2 6 
// 3 7 10 
// 4 8 11 13 
// 5 9 12 14 15

package number_patterns;

public class Pattern23 {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        int value = n-1;
        for(int i=1;i<=n;i++){
            int c = count;
            for(int j=1;j<=i;j++){
                System.out.print(c+" ");
                c = c + value;
                value--;
            }
            value = n-1;
            count++;
            System.out.println();
        }
    }
}

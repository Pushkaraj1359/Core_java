// 15
// 13      14
// 10      11      12
// 6       7       8       9
// 1       2       3       4       5

package number_patterns;

public class Pattern22 {
    public static void main(String[] args) {
        
        int n = 5;
        int count = 15;
        int value = 2;
        for(int i=1;i<=n;i++){
            int c = count;
            for(int j=1;j<=i;j++){
                System.out.print(c+"\t");
                c++;
            }
            count = count - value;
            value++;
            System.out.println();
        }
    }
}

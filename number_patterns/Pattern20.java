// 15
// 14      13
// 12      11      10
// 9       8       7       6
// 5       4       3       2       1

package number_patterns;

public class Pattern20 {
    public static void main(String[] args) {
        int count = 15;
        for(int i=1;i<=5;i++){
            int c = count;
            for(int j=1;j<=i;j++){
                System.out.print(c+"\t");
                c--;
            }
            count = count - i;
            System.out.println();
        }
    }
}

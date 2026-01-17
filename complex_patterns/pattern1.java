package complex_patterns;

public class pattern1 {
    public static void main(String[] args) {
        int n =5;
        for(int k=1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.print("_");
            }
            System.out.println();
        }
    }
}

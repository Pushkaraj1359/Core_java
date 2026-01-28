package array_problems;
import java.util.Scanner;

public class rowsColomn {
    static void diaplayArray(int rows){
        Scanner scanner = new Scanner(System.in);
        int col=scanner.nextInt();

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the rows : " );
        int rows = scanner.nextInt();
        int A[][] = new  int [rows][];

        //by using this below loop we can take the colomn as an input
        for(int i=0;i<A.length;i++){
            System.out.println("enter the col : " );
            int col = scanner.nextInt();
            A[i]=new int[col];
        }
        
        // take runs 
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.println("enter run : " );
                A[i][j]=scanner.nextInt();
                
            }
        }

        // print runs
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }


    }
}

import java.util.*;
class class_pra{
        static void display(int A[][]){
            for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.print("["+i+""+ j+" ] " +A[i][j]+" ");
            }
        }
        }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int A[][]= new int [3][3];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[i].length;j++){
                System.out.println("enter");
                A[i][j]=scanner.nextInt();
            }
        }
        display(A);
    }
}
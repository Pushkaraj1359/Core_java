package array_practice;
import java.util.Scanner;

public class Dynamic_array_create {


    static void createArray(int size){
        Scanner scanner = new Scanner(System.in);
        int A[] = new int [size];

        for(int i=0;i<A.length;i++){
            A[i]=scanner.nextInt();
        }

        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }

    static void backwardArray(int A[]){
        System.out.print("backword array : ");
        for(int i=A.length-1;i>=0;i--){
            System.out.print(A[i]+" ");
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        createArray(size);

        int A[]={11,22,33,44,55};
        backwardArray(A);


    }
}

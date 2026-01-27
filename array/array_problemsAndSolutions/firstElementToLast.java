package array_problemsAndSolutions;
import java.util.Scanner;

public class firstElementToLast {
    static void displayArray(int size){
        Scanner scanner =new Scanner(System.in);
        int A[]=new int [size];
        System.out.println("enter array element");
        for(int i=0;i<A.length;i++){
            A[i]=scanner.nextInt();
        }
        System.out.print("array elements :");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }

        System.out.println();

        // int firstElement = A[0];
        // for(int i=0;i<A.length-1;i++){
        //     A[i]=A[i+1];
        // }
        // A[A.length-1]=firstElement;
        // System.out.print("the updated array : ");
        // for(int i=0;i<A.length;i++){
        //     System.out.print(A[i]+" ");
        // }


        // without using third variable
        // for(int i = 0; i < A.length - 1; i++){
        //     A[i] = A[i] + A[i+1] - (A[i+1] = A[i]);  //one-line arithmetic/XOR version
        // }
        // System.out.print("the updated array : ");
        // for(int i=0;i<A.length;i++){
        //     System.out.print(A[i]+" ");
        // }

    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("ENTER ARRAY SIZE");
        int size=scanner.nextInt();
        displayArray(size);
    }
}

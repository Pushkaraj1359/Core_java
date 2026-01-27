package array_problemsAndSolutions;
import java.util.Scanner;

public class lastToFirst {
    static void createArray(int size){
        Scanner scanner = new Scanner(System.in);
        int A[] = new int[size];
        // take array element as an input 
        for(int i=0,count=0;i<A.length;i++,count++){
            System.out.print("enter array " + count + " element ");
            A[i]=scanner.nextInt();
        }
        // display array elements
        System.out.print("display array elements : ");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }

        // int lastElement = A[A.length-1];
        // for(int i=A.length-1;i>0;i--){
        //     A[i]=A[i-1];
        // }
        // A[0]=lastElement;
        // System.out.println();
        // System.out.print("the updated array elements : ");
        // for(int i=0;i<A.length;i++){
        //     System.out.print(A[i]+" ");
        // }
        
        
        
        //Using XOR (no temp variable, safe)
        for(int i = A.length-1; i > 0; i--){
            A[i] = A[i] ^ A[i-1];
            A[i-1] = A[i] ^ A[i-1];
            A[i] = A[i] ^ A[i-1];
        }
        System.out.println();
        System.out.print("the updated array elements : ");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }

    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter array size");
        int size = scanner.nextInt();
        createArray(size);
    }
}

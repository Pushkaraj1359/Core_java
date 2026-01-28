package array_problemsAndSolutions;
import java.util.Scanner;

public class lastToFirstFirstToLast {
    static void createArray(int size){
        Scanner scanner = new Scanner(System.in);
        int A[] = new int [size];
        for(int i=0;i<A.length;i++){
            System.out.print("enter array element : ");
            A[i]=scanner.nextInt();
        }
        System.out.print(" array elements : ");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }


        // swap first to last and last to first...
        // Swap using temporary variable
        // int temp = A[0];            // store first element
        // A[0]=A[A.length-1];         // last---> first
        // A[A.length-1]=temp;         // first---> last


        // Using arithmetic (no extra variable)
        // A[0]=A[0] + A[A.length-1];               // first = first + last;
        // A[A.length-1]= A[0] - A[A.length-1];     // last = first - last;
        // A[0]=A[0] - A[A.length-1];               // first = first - last;
        
        

        // Using XOR (popular interview trick)
        A[0] = A[0] ^ A[A.length-1];               
        A[A.length-1] = A[0] ^ A[A.length-1];     
        A[0] = A[0] ^ A[A.length-1];  
        
        
        System.out.print("updated Array : ");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array size");
        int size = scanner.nextInt();
        createArray(size);
    }
}

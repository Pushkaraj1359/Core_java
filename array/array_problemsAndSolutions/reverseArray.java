package array_problemsAndSolutions;
import java.util.Scanner;

public class reverseArray {
    static void createArray(int size){
        Scanner scanner = new Scanner(System.in);

        int A[] = new int [size];

        for(int i=0;i<A.length;i++){
            System.out.print("enter array element : ");
            A[i] = scanner.nextInt();
        }

        System.out.println("array elements : ");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        
        // simple way...
        // System.out.println("Reverse array elements : ");
        // for(int i=A.length-1;i>=0;i--){
        //     System.out.print(A[i]+" ");
        // }



        // reversed the array using the two-pointer technique
        // int start = 0;
        // int end = A.length-1;

        // while(start < end){
        //     int temp = A[start];   // temp = A[0]
        //     A[start] = A[end];        // end = A[0]
        //     A[end] =  temp;        // end = temp

        //     start++;
        //     end--;
        // }
        // for(int i=0;i<A.length;i++){
        //     System.out.print(A[i]+" ");
        // }


        // Using XOR swapping (safe & preferred)
        // int start = 0;
        // int end = A.length - 1;

        // while (start < end) {
        //     A[start] = A[start] ^ A[end];
        //     A[end]   = A[start] ^ A[end];
        //     A[start] = A[start] ^ A[end];

        //     start++;
        //     end--;
        // }

        // for (int i = 0; i < A.length; i++) {
        //     System.out.print(A[i] + " ");
        // }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter array size");
        int size = scanner.nextInt();
        createArray(size);

    }
}

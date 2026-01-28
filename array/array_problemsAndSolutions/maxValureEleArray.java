package array_problemsAndSolutions;
import java.util.Scanner;

public class maxValureEleArray {

    static int[]  createArray(int size){
        Scanner scanner = new Scanner(System.in);
        int A[] = new int [size];

        for(int i=0;i<A.length;i++){
            System.out.println("enter array element : ");
            A[i]=scanner.nextInt();
        }

        System.out.print("array elements : ");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        maxElementArray(A);
        return A;
    }

    static int maxElementArray(int A[]){
        int max = A[0];
        for(int i=1;i<A.length;i++){
            while(max < A[i]){
                max = A[i];
            }
        }
        System.out.println();
        System.out.println("the max element in array : "+max);
        return max;
    }

    static int secondMaxArray(int[] A) {
    int max = A[0];
    // find max
    for (int i = 1; i < A.length; i++) {
        if (A[i] > max) max = A[i];
    }

    int secondMax = Integer.MIN_VALUE;
    // find second max
    for (int i = 0; i < A.length; i++) {
        if (A[i] != max && A[i] > secondMax) {
            secondMax = A[i];
        }
    }
    return secondMax;
}
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the array size : ");
        int size = scanner.nextInt();
        int A[]= createArray(size);
    }
}

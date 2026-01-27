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
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array size");
        int size = scanner.nextInt();
        createArray(size);

    }
}

package array_problemsAndSolutions;

import java.util.Scanner;
public class sumOfArrayElements {

    static void displayArray(int size){
        int A[] = new int [size];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<size;i++){
            System.out.println("enter array element");
            A[i] = scanner.nextInt();
        }
        System.out.print("array elements : ");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        sumOfArrayElements(A);
        sumOfOddElements(A);
        getArray(A);
    }

    // the sum of array elements..
    static int sumOfArrayElements(int A[]){
        System.out.print("sum of array elements : ");
        int sum = 0;
        int count = 0;
        for(int i=0;i<A.length;i++){
            // System.out.print(A[i]+" ");
            sum = sum + A[i];
            count++;
        }
        System.out.println(sum);
        System.out.println("the count value is = "+count);
        averageOfArrayElement(sum,count);
        return sum ;
    }

    // the average of array element
    static int averageOfArrayElement(int sum, int count){
        int average = sum / count;
        System.out.println("the average of array elements = "+ sum +" / "+ count +" = "+average);
        return average;
    }

    // sum of odd  and even elements
    static void sumOfOddElements(int A[]){
        int addition = 0;
        int add = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]%2!=0){
                // System.out.print(A[i]+" ");
                addition = addition + A[i];
            }
            if(A[i]%2==0){
                // System.out.print(A[i]+" ");
                add = add + A[i];
            }
        }
        System.out.println("the sum of odd elements ="+addition);
        System.out.println("the sum of even elements ="+add);
    }

    // Elements Greater than Average
    static void getArray(int A[]){
        int s = 0;
        int c = 0;
        System.err.print("the elements are greater then average = ");
        for(int i=0;i<A.length;i++){
            s = s + A[i];
            c++;
        }
        for(int i=0;i<A.length;i++){
            int ave = s/c;
            if(A[i]>ave){
                System.out.print(A[i]+" ");
            }
            
        }
    }


    
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter array size");
        size = scanner.nextInt();
        displayArray(size);

    }
}

package array_problemsAndSolutions;

public class E_LastDigitArray {
    public static void main(String[] args) {
        int[] arr = {123, 235, 6754, 3257, 64, 2367, 288, 35, 645, 374};
        System.out.println("original array");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]%10;
        }
        System.out.println();

        System.out.println("the last digit with array");
        for(int x : arr){
            System.out.print(x+" ");
        }
    }
}

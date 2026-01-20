package array_problems;

public class F_array {

    // print array all element
    static void forward_array_print(int arr[]){
        System.out.println("the forward array elements : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    

    // print array as backward
    static void backward_array_print(int arr[]){
        System.out.println("the backward array elements : ");
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {

        int arr [] = {11,22,33,44,55};
        forward_array_print(arr);

        backward_array_print(arr);
    }
}

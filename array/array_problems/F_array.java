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
        System.out.println();
    }

    // Sum of odd elements
    static void sum_Off_odd_array_elements(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                sum =  sum + arr[i];
                // System.out.print(arr[i]+" ");
            }
        }
        System.out.println("Sum of odd elements = "+sum);
    }

    // Sum of all array elements
    static void sum_of_all_array_elements(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("the sum all array elements = "+sum);
    }

    static void array_average(int arr[]){
        int count = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
            count++;
        }
        int average = sum/count;
        System.out.println("the average of array element is ="+average);
    }

    // the element greater then average value
    static void element_greater_then_average(int arr[]){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("the sum of all array element is = "+sum);

        double average = sum / arr.length;
        System.out.print("the element greater then average value : ");
        for(int i=0;i<arr.length;i++){
            if( arr[i] > average ){
                System.out.print( arr[i]+ " ");
            }
        }
    }

    

    

    public static void main(String[] args) {

        int arr [] = {11,22,33,44,55};
        forward_array_print(arr);
        backward_array_print(arr);
        sum_Off_odd_array_elements(arr);
        sum_of_all_array_elements(arr);
        array_average(arr);
        element_greater_then_average(arr);

    }
}

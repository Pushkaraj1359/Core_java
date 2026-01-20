package array_problems;

public class B_sum_array {
    public static void main(String[] args) {
        int arr[]={5, 8, 12, 6,3};

        // forward element printing 
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // backward element printing 
        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // int sum1= 0;
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2!=0){
        //         sum1=sum1+arr[i];
        //     }
        // }
        // System.out.println("the sum of odd elements = "+ sum1);

        // int sum = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum = sum +arr[i];
        // }
        // System.out.println("sum of array = "+sum);

        // float average;
        // average = sum / arr.length;
        // System.out.println("the array average is = "+average);
    }
}

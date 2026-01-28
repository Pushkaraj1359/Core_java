// Find Pair with Given Sum
 
// Write a program to find all pairs of two elements in an array whose sum is equal to a given number.



package array_problemsAndSolutions;

public class A_arrayPairSum {
    public static void main(String[] args) {
        
        int arr[]={4,8,12,16};
        int target = 20;

        System.out.println("the sum of paris :"+ 20);

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println("("+ arr[i] +","+ arr[j] + ")" );
                }
            }  
        }
    }
}

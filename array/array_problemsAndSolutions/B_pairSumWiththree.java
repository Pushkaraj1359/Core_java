// Write a program to find all triplets of three elements in an array whose sum is equal to a given number.
 
// Example Input:
// Array = [3, 6, 9, 12, 15]
// Target Sum = 30


package array_problemsAndSolutions;

public class B_pairSumWiththree {
    public static void main(String[] args) {
        int arr[]={3,6,9,12,15};
        int target = 30;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        System.out.println(" "+arr[i]+"+"+arr[j]+"+"+arr[k]+"="+target);
                    }
                }
            }
        }
    }
}

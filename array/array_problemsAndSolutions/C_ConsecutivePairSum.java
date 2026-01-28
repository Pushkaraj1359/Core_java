package array_problemsAndSolutions;

public class C_ConsecutivePairSum {
    public static void main(String[] args) {
        int arr[]={1,2,3,2,3};   
        int target = 5;

        for(int i=0,j=i+1;i<=arr.length && j<arr.length;i++,j++){
            if(arr[i]+arr[j]==target){
                System.out.println(arr[i]+" "+arr[j]+" ="+ target);
            }
        }
    }
}

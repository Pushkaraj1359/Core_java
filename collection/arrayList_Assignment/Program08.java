
// Write a   Java  program to put even and odd elements of an array in two separate arrays.
package arrayList_Assignment;
import java.util.ArrayList;

class Program08{
    public static void main(String[] args){
        int[] arr = {9,10,5,4,35,3,23,2,6,7,65,66,78};

        ArrayList<Integer> evenArr = new ArrayList<>();
        ArrayList<Integer> oddArr = new ArrayList<>();

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenArr.add(arr[i]);
            }
            else{
                oddArr.add(arr[i]);
            }
        }
        System.out.println("even array :"+evenArr);
        System.out.println("odd array :"+oddArr);
    }
}



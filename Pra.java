import inheritance.main;

public class Pra{

    static int binarySearch(int arr[],int ele){
        int low=0;
        int high=arr.length;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==ele){
                return mid;
            }
            else if(arr[mid]<ele){
                low = mid+1;
            }
            else if(arr[mid]>ele){
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int ele = 8;
        System.out.println(binarySearch(arr,ele));
    }
}

//  binary search algorithm   and added with recursion calling function
package array_problemsAndSolutions;

public class F_FirstLastDigit {
    public static void main(String[] args) {
        int arr[]={123,235,6754,3257,64,2367,288,35,645,374};

        System.out.println("the original array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            int num = arr[i];
            int last = num%10;
            int first = num;

            while(first>=10){
                first/=10;
            }
            arr[i]=first*10+last;
        }
        System.out.println();

        System.out.println("the updated array : ");
        for(int x : arr){
            System.out.print(x+" ");
        }

    }
}

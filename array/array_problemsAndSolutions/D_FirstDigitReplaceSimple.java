package array_problemsAndSolutions;

public class D_FirstDigitReplaceSimple {
    public static void main(String[] args) {
        int arr[]={123,235,6754,3257,64,2367,288,35,645,374};

        System.out.println("the original array : ");
        for(int num : arr){
            System.out.print(num+" ");
        }

         // Replace each element with its first digit
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            while(num>10){
                num /= 10;   // keep dividing by 10 
            }
            arr[i]=num;      // replace with first digit
        }
        System.out.println();

        System.out.println("the updated array : ");
        for(int num : arr){
            System.out.print(num+" ");
        }


    }
}

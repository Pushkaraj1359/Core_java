package array_problemsAndSolutions;

public class G_FirstDigitAtLast {
    public static void main(String[] args) {
        int[] arr = {123,235,6754,3257,64,2367,288,35,645,374};

        // for (int i = 0; i < arr.length; i++) {
        //     int num = arr[i];

        //     int first = num;
        //     int pow = 1;

        //     // find first digit and its place value
        //     while (first >= 10) {
        //         first /= 10;
        //         pow *= 10;
        //     }

        //     int remaining = num % pow;      // remove first digit
        //     arr[i] = remaining * 10 + first; // move first digit to last
        // }

        // // print result
        // for (int x : arr) {
        //     System.out.print(x + " ");
        // }

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int first = num;
            int pow = 1;

            while(first>=10){
                first /=10;
                pow*=10;
            }
            int remaining = num % pow;
            arr[i]=remaining*10+first;
        }

        for(int x : arr){
            System.out.print(x+" ");
        }        
    }
}


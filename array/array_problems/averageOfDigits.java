//  WAP to replace each elements with their avg of digit
//  Example Input:
// input: {123,235,6754,3257,64,2367,288,35,645,374,56}
// Output: {2, 3, 5, 4, 5, 4, 6, 4, 5, 4, 5}





package array_problems;

public class averageOfDigits {
    // static void findDigitAve(int A[]){
    //     for(int i=0;i<A.length;i++){
    //         int sum = 0;
    //         int count = 0;
    //         while(A[i]>0){
    //             int temp = A[i] % 10;
    //             sum = sum + temp;
    //             A[i] = A[i] / 10;
    //             count++;
    //         }
    //         System.out.println("sum"+sum+ " "+"count of digit"+count );
    //         // int average = sum / count;
    //         int ave =sum/count;
    //         System.out.println("average = "+ave);
    //         // A[i]=ave;
    //     }
    // }

    static int sumDigit(int num){
        int sum = 0;
        while(num!=0){
            int temp = num % 10;
            sum = sum + temp;
            num = num / 10;
        }
        retun sum;
    }
    // static void averageDigit(int A[]){
    //     for(int i=0;i<A.length;i++){
    //         A[i]= sumOfDigit(A[i])/countDigit(A[i]);
    //     }
    // }
    public static void main(String[] args){
        int A[]={123,235,6754,3257,64,2367,288,35,645,374,56};
        findDigitAve(A);
    }
}

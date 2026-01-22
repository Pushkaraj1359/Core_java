// WAP to shift last digit to first from each elements
 
// Example Input:
// input: {123,235,6754,3257,64,2367,288,35,645,374}
// output:{312,523,4675,7325,46,7236,828,53,564,437}

// Ex : 1234%10=4    last digit = 4
//      1234/10=123  remove last digit




package array_problems;

public class moveLastDigitToFirst {

    


    static void replaceLastAsFirst(int A[]){
        for(int i=0;i<A.length;i++){
            A[i]=sumOfDigit(A[i]);
        }
    }

    static void display(int A[]){
        for(int x : A){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        int A[]= {123,235,6754,3257,64,2367,288,35,645,374};
        display(A);
        replaceLastAsFirst(A);
    }
}

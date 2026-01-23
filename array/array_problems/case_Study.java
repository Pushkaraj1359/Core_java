// WAP to solve following case study
// consider black number, which is divisible by 6.
// Consider the white number, which contains 6.
// consider grey number, which is both black & white
// replace black number with -1.
// replace white number with -2.
// replace the grey number with -3.

// Example Input:
// input: {15,23,18,26,72,36,49,38,60,17,22,46}


package array_problems;

public class case_Study {

    static boolean is6Present(int n){
        while(n!=0){
            if(n%10==6){
                return true;
            }
            n=n/10;
        }
        return false;
    }

    static void display(int A[]){
        for(int i=0;i<A.length;i++){
            // System.out.print(A[i]+" ");
            int num = A[i];
            if(num%6==0 && is6Present(num)){
                A[i]=-3;
            }
            else if(num%6==0){
                A[i]=-1;
            }
            else{
                A[i]=-2;
            }

        }
    }
    
    public static void main(String[] args) {
        int A[]={15,23,18,26,72,36,49,38,60,17,22,46};
        display(A);
    }
}

// WAP to replace first digit at last of element.
 
// Example Input:
// input: {123,235,6754,3257,64,2367,288,35,645,374}
// output:{231,352,7546,2573,46,3672,882,53,456,743}



package array_problems;

public class swap {
    static void replaceFirstDigitToLast(int A[]){
            for(int i=0;i<A.length;i++){
                // 123
                // calculate multipler
                int y = (int)Math.log10(A[i]);
                int multipler = (int)Math.pow(10,y);
                A[i]=(A[i]%multipler)*10+(A[i]/multipler);
            }
        }
        static void display( int A[]){
            for( int ele : A){
                System.out.println();
            }
        }
    public static void main(String[] args) {
        int A[]={123,235,6754,3257,64,2367,288,35,645,374};
        display(A);
        replaceFirstDigitToLast(A);
        display(A);

    }
}

// package array-2-d.java;

public class printSumOfRowsAndColomn {
    static void printSumOfRowsAndColomn(int A[][]){
        int rowssum=0; 
        int colomnSum=0;
        
        for(int i=0;i<A.length;i++){
            rowssum=0; 
            colomnSum=0;
            for(int j=0;j<A[i].length;j++){
                rowssum +=A[i][j];
                colomnSum +=A[i][j];
    
            }
            System.out.println("the sum of rowsSum "+rowssum);
            System.out.println("the sum of colomnSum "+colomnSum);
        }
    }
    public static void main(String[] args) {
        int A[][]={{1,2,3},{4,5,6},{7,8,9}};
        printSumOfRowsAndColomn(A);
        
    }
}

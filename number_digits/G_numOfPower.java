package number_digits;

public class G_numOfPower {
    static int findPow(int base, int exponent){
        int resuit = 1;
        for(int i=1;i<=exponent;i++){
            resuit = resuit * base;
        }
        return resuit;
    }
    public static void main(String[] args) {
        // 3*3*3*3=81;
        // int base = 3;
        // int exponent = 4;
        // int resuit = 1;

        // for(int i=1;i<=exponent;i++){
        //     resuit = resuit * base;
        // }
        // System.out.println(resuit);

        
        int base = 3;
        int exponent = 4;
        System.out.println(findPow(base,exponent));
    }
}

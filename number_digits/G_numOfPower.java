package number_digits;

public class G_numOfPower {
    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        int resuit = 1;

        for(int i=1;i<=exponent;i++){
            resuit = resuit * base;
        }
        System.out.println(resuit);
    }
}

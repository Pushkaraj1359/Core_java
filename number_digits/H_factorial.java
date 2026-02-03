// package number_digits;

// public class H_factorial {
//     public static void main(String[] args) {
//         int num = 5;
//         int fact = 1;
//         for(int i=1;i<=5;i++){
//             fact = fact * i;
//         }
//         System.out.println(fact);
//     }
// }



package number_digits;

public class H_factorial {
    static int findFactorail(int num){
        // fact start with 1
        int fact = 1;
        while(num>=1){
            fact = fact * num;
            num--;
        }
        return fact;
    }
    public static void main(String[] args) {
        // int num = 5;
        // int fact = 1;
        // while(num>=1){
        //     fact = fact * num;
        //     num--;
        // }
        // System.out.println(fact);
        int num = 5;
        System.out.println(findFactorail(num));
    }   
}
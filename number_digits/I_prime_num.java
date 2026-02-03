package number_digits;

public class I_prime_num {
    static void findPrime(int num){
        int count = 0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("this num is prime number : ");
        }else{
            System.out.println("this num is not prime number : ");
        }

    }
    public static void main(String[] args) {
        int num = 3;
        findPrime(num);
        // int count =0;

        // for(int i=1;i<=num;i++){
        //     if(num%i==0){
        //         count++;
        //     }
        // }
        // if(count==2){
        //     System.out.println("this is an prime number");
        // }
        // else{
        //     System.out.println("this is not an prime number");
        // }
    }
        
}

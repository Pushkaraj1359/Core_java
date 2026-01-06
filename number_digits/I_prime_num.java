package number_digits;

public class I_prime_num {
    public static void main(String[] args) {
        int num = 5;
        int count =0;

        for(int i=1;i<=num;i++){
            if(num%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("this is an prime number");
        }
        else{
            System.out.println("this is not an prime number");
        }
    }
        
}

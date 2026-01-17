package complex_patterns;

public class pattern1 {
    public static void main(String[] args) {
        int n =5;
        for(int l=1;l<=n;l++){
            for(int k=1;k<=n;k++){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(l%2!=0 && i%2==0  || l%2==0 && i%2==1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                    // if(l%2!=0 && i%2==0){
                    //     System.out.print("*");
                    // }
                    // else{
                    //     System.out.print("*");
                    // }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        }
    }
}


//     void f1(int n){
//         if(n<=0){
//             return;
//         }
//         System.out.println(n);
//         if(n%2==0){
//             f1(n-1);
//         }
//         else{
//             f1(n-2);
//         }
//     }
//     public static void main(String[] args) {
//         f1(3);
//     }
// }


class Example01 {
    static int sum(int n){
        if(n==1) return 1;

        return n+sum(n-1);
    }
    
    public static void main(String[] args) {
        int res = sum(3);
        System.out.println(res);
    }
}

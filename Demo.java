// class details extends Thread{
//     public  void run(){
//         for(int i=1;i<=10;i++){
//             System.out.println(10*i+" "+Thread.currentThread().getName());
//         }
//     }
// }


// public class Demo{
//     public static void main(String[] args) {
//         details t1=new details();
//         // t1.run();    
//         for(int i=1;i<=10;i++){
//             System.out.println(10*i+" "+Thread.currentThread().getName());
//         }
//         t1.start();  
//     }
// }


// // HOW TO CREATE THREAD AND RUN ??

class Details implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println(10*1+" "+Thread.currentThread().getName());
        }
    }
}
class Demo{
    public static void main(String[] args) {
        Details t1=new Details();
    }
}
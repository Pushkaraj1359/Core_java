
class Student1 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+(i*5));
        }
    }
}

class Student2 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+(i*10));
        }
    };
}


public class Demo2 {
    public static void main(String[] args){
        Student1 s1 = new Student1();
        Student2 s2 = new Student2();
        
        s1.setName("Deepak");
        s2.setName("Pushkaraj");
        
        
        s1.start();
        s2.start();
        
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+(i*20));
        }
        
    }
}

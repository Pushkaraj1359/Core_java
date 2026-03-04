package MultiThreading_practice;

import Student1;
import Student2;

class Student1 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+"Pushkaraj");
        }
    }
}
class Student2 extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+"Akash");
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Student1 s1= new Student1();
        Student2 s2=new Student2();
        Thread  t = Thread.currentThread();

        t.setName("teacher");
        s1.setName("Stu1");
        s2.setName("Stu2");
        
        s1.start();
        s2.start();


        System.out.println("how many thread created in my code :"+Thread.activeCount());
        
        
            for(int i=1;i<=5;i++){
                System.out.println(Thread.currentThread().getName()+" "+"Riya");
            }

    }
}

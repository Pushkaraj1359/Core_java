package MultiThreading_practice;

class Ram extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+(5*i));
        }
    }
}

class Shyam extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+(11*i));
        }
    }
}

// JVM --> MAIN THREAD --> main()
public class Demo {
    public static void main(String[] args) {
        // very important method
        // In multithreading, start() method always calls no-argument run() method. 
        // Overloaded run() methods are not executed by thread scheduler.
        
        Ram r1=new Ram();     // each an every thread get individual stack so that reason every thread work individually  
        Shyam s1=new Shyam();
        
        // sequnce is not mendatray to run which one is run first its totaly depends on CPU schedular

        // important Note : -
        // if you want t o setName accoding to you then we must setName before start method 

        r1.setName("Pushkaraj");
        s1.setName("Dheeraj");        
        r1.start(); // RUNNABLE -----> READY FOR RUN ---> RUN Ram
        s1.start(); // RUNNABLE -----> READY FOR RUN ---> RUN Shyam
        //  start() method ---> JVM INTERNALLY --->  create new thread   ---> call run();

        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+(11*i));
        }
    }
}

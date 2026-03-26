class A extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i*2);
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i*10);
        }
    }
}




class Example{
    public static void main(String[] args) {

        A a1=new A();
        B b1=new B();

        a1.start();
        b1.start();


        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i*5);
        }
    }
}
package class_objects;

class Demo{
    int a=10;
    String b="Pushkaraj";


    void Show(){
        System.out.print(a+" "+b);
    }
}


public class A_demo {
    public static void main(String[] args) {
        Demo r=new Demo();
        r.Show();
    }
}

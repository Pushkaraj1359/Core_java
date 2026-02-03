package class_objects;

// class Demo{
    
//     int a=10;                             // instance variable..
//     String name="Pushkaraj";


//     void Show(){
//         System.out.print(a+" "+name);
//     }
// }


// public class A_demo {
//     public static void main(String[] args) {
//         Demo r = new Demo();
//         r.Show();
//     }
// }


class Demo{
    int roll = 50;
    String name = "pushkaraj";

    void show(){
        System.out.println(roll);
        System.out.println(name);
    }

}

public class A_demo{
    public static void main(String[] args) {
        Demo r = new Demo();
        r.show();
    }
}


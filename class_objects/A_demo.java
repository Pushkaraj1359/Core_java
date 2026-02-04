package class_objects;

// class Demo{
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
    String name = "pushkaraj";
    int a = 10;

    void showDetails(){
        System.out.println("name : "+name);
        System.out.println("a : "+a);
    }
}
public class A_demo{
    public static void main(String[] args){
        Demo r = new Demo();
        r.showDetails();
    }
}


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


class Details{
    int rollNo = 50;
    String name  = "Pushkaraj";

    void showDetails(){
        System.out.println("rollNo :"+rollNo);
        System.out.println("name : "+name);
    }
}

public class A_demo{
    public static void main(String[] args){
        Details r = new Details();
        r.showDetails();
    }
}

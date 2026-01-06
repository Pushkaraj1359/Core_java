package class_objects;

class App{
    int id;
    String name;
    int mark;

    App(){
        id=1;
        name="Pushkaraj";
        mark=82;
    }

    void showDetails(){
        System.out.println("the student id ="+id);
        System.out.println("the student name ="+name);
        System.out.println("the student mark ="+mark);
    }

    String getName(){
        return name;
    }
    void setName(String name){
        this.name=name;
    }

}

public class Student {
    public static void main(String[] args) {
        App s=new App();
        s.showDetails();
        System.out.println("the student name is ="+s.getName());
        System.out.println("after updating name");
        s.setName("Deepak");
        s.showDetails();



    }
}

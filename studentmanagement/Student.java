package studentmanagement;

class Student {
    int studentId;
    String name;
    int marks;


    Student(int studentId, String name, int marks) {
        this.studentId = studentId;
        this.name = name;
        this.marks = marks;
    }


    void displayStudent() {
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}
    


class employee{
    String name ;
    int age ;

    employee(String name,int age) {
        this.name=name;
        this.age=age;
    }

    void displayEmp(){
        System.out.println("emp name :"+name);
        System.out.println("emp age :"+age);
    }

    
}
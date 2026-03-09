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

package studentmanagement;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(1, "Pushkaraj", 85);
        Student s2 = new Student(2, "Vaibhav", 90);
        Student s3 = new Student(3, "Bharat", 78);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        manager.displayAllStudents();

        manager.searchStudent(1);
    }
}

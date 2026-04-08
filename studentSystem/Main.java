package studentSystem;

public class Main {
    public static void main(String[] args) {
        
        StudentManager  manager = new StudentManager();

        Student s1 = new Student(1,"Pushkaraj",86);
        Student s2 = new Student(2,"Hanumant",88);
        Student s3 = new Student(3,"sham",81);

        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);

        // manager.displayAllStudent();

        // manager.searchStudent(2);
        // manager.deleteStudent(2);
        // manager.displayAllStudent();






    }
}

package collection.hasSetProjects.studentSystem;

public class Main {
    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        Student s1 = new Student(1,"Pushkaraj");
        Student s2 = new Student(2,"Hanumant");
        Student s3 = new Student(3,"Ajay");
        Student s4 = new Student(4,"Deepak");
        
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        manager.addStudent(s4);

        // DISPLAY
        manager.displayAllStudent();

        // SEARCH
        Student result = manager.searchById(2);
        if (result != null) {
            System.out.println("Found:");
            result.displayStudent();
        } else {
            System.out.println("Not found");
        }

        // REMOVE
        manager.removeById(3);

        System.out.println("After removal:");
        manager.displayAllStudent();
    }
}
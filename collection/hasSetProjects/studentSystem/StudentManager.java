package collection.hasSetProjects.studentSystem;

import java.util.HashSet;

public class StudentManager {
    HashSet<Student> student = new HashSet<>();

    void addStudent(Student s) {
        student.add(s);
    }

    void displayAllStudent() {
        for (Student s : student) {
            System.out.println(s);
        }
    }
}

package collection.hasSetProjects.studentSystem;

import java.util.HashSet;

public class StudentManager {
    // HashSet<Student> student = new HashSet<>();

    // // ADD
    // void addStudent(Student s) {
    //     student.add(s);
    // }

    // // DISPLAY ALL
    // void displayAllStudent() {
    //     for (Student s : student) {
    //         s.displayStudent();
    //         System.out.println("------------");
    //     }
    // }

    // // SEARCH BY ID
    // Student searchById(int id) {
    //     for (Student s : student) {
    //         if (s.id == id) {
    //             return s;
    //         }
    //     }
    //     return null;
    // }

    // // REMOVE BY ID
    // void removeById(int id) {
    //     Student toRemove = null;

    //     for (Student s : student) {
    //         if (s.id == id) {
    //             toRemove = s;
    //             break;
    //         }
    //     }

    //     if (toRemove != null) {
    //         student.remove(toRemove);
    //         System.out.println("Student removed");
    //     } else {
    //         System.out.println("Student not found");
    //     }
    // }

    HashSet<Student> student=new HashSet<Student>();

    // add student
    void addStudent(Student s){
        student.add(s);
    }

    // display all student
    void displayAllStudent(){
        for(Student s : student){
            s.displayStudent();
        }
    }

    // serach student id
    Student searchById(int id){
        for(Student s : student){
            if(s.id == id){
                return  s;
            }
        }
        return null;
    }

    //remove student
    void removeById(int id){
        Student toRemove =  null;
        for(Student s : student){
            if(s.id == id){
                toRemove = s;
            }
        }
        if(toRemove != null){
            student.remove(toRemove);
        }
    }
}    












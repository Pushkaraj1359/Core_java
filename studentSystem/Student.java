package studentSystem;

public class Student {
    int studentId;
    String studentName;
    int studentMark;

    public Student(int studentId,String studentName,int studentMark) {
        this.studentId=studentId;
        this.studentName =  studentName;
        this.studentMark = studentMark;
    }

    void displayStudent(){
        System.out.println("student id : "+studentId);
        System.out.println("student Name : "+studentName);
        System.out.println("student Mark : "+studentMark);
        System.out.println("--------------------------------");
    }
}

package studentmanagement;

class StudentManager {

    Student[] students = new Student[8];
    int count = 0;

    void addStudent(Student student) {
        students[count] = student;
        count++;
    }

    void displayAllStudents() {
        for (int i = 0; i < count; i++) {
            students[i].displayStudent();
        }
    }

    void searchStudent(int studentId){
        for(int i=0;i<count;i++){
            if(students[i].studentId == studentId){
                students[i].displayStudent();
            }
        }
    }

    
    void deleteStudent(int studentId){
        for(int i=0;i<count;i++){
            if(students[i].studentId == studentId){
                for(int j=i;j<count-1;j++){
                    students[j]= students[j+1];
                }
                count--;
            }
        }
    }
}

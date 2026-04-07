package Pratice_folder.project01;

public class Student{
    int id;
    String name;

    public void setData(int id,String name){
        this.id=id;
        this.name=name;
    }

    public void display(){
        System.out.println("Student Details: "+id+" "+name);
    }
}

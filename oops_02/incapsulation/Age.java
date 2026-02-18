package oops_02.incapsulation;

class Student{
    private int age;
    private String name;

    public Student(){

    }

    public Student(int age,String name){
        setAge(age);
        setName(name);
    }

    public void setAge(int age){
        if(age>0){
            this.age=age;
        }
        else{
            System.out.println("invalid age");
        }
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        if(name != null && !name.trim().isEmpty()){
            this.name=name;
        }
        else{
            System.out.println("name is inValid : ");
        }
    }

    public String getName(){
        return name;
    }

    public void showStudentDetails(){
        System.out.println("AGE :"+age);
        System.out.println("NAME :"+name);
    }

}
class Age{
    public static void main(String[] args){
        Student s1=new Student(23," ");
        s1.showStudentDetails();
        // s1.setAge(23);
        // System.out.println("age : "+s1.getAge());
        // s1.setName("pushkaraj");
        // System.out.println(s1.getName());
    }
}
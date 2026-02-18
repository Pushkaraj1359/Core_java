package oops_02.incapsulation;

class Student{
    private int age;
    private String name;

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

}
class Age{
    public static void main(String[] args){
        Student s1=new Student();
        s1.setAge(23);
        System.out.println("age : "+s1.getAge());
        s1.setName("pushkaraj");
        System.out.println(s1.getName());
    }
}
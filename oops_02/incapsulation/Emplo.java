/*Problem 1: 
Employee
Create a class Employee with:
private int id
private String name
private double salary

Tasks:
Create getter and setter methods
In main(), create object
Set values
Print values using getter */

package oops_02.incapsulation;

class Employee{
    private int id;
    private String name;
    private double salary;

    public void setId(int id){
        if(id>0 && id<100){
            this.id=id;
        }
        else{
            System.out.println("id is invalid : ");
        }
    }
    public int getId(){
        return id;
    }

    public void setName(String name){
        if(name!=null && !name.trim().isEmpty()){
            this.name=name;
        }
        else{
            System.out.println("name is inValid");
        }
    }
    public String getName(){
        return name;
    }

    public void setSalary(double salary){
        if(salary > 0){
            this.salary=salary;
        }
    }
    public double getSalary(){
        return salary;
    }
}

public class Emplo {
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.setId(1);
        e1.setName("pushkaraj");
        e1.setSalary(1047920.44);
        System.out.println("id : "+e1.getId());
        System.out.println("name : "+e1.getName());
        System.out.println("salary : "+e1.getSalary());
    }
}

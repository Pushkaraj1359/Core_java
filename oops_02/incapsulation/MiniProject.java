/*Employee Registration System

Create class Employee

Private Fields:
private String empId;
private String name;
private double salary;
private String department;

Rules:
🔹 empId
Must start with "EMP"

Followed by 3 digits

Example: 
EMP101
(Hint regex: EMP[0-9]{3})

🔹 name
Only letters and space
Minimum 3 characters

🔹 salary
Must be greater than 10,000

🔹 department
Only allow: "HR", "IT", "SALES" */


package oops_02.incapsulation;

class Employee{
    private String empId;
    private String name;
    private double salary;
    private String  department;

    public Employee(){

    }
    public Employee(String empId,String name,double salary,String department){
        setId(empId);
        setName(name);
        setSalary(salary);
        setDepartment(department);
    }

    // for id
    public void setId(String empId){
        if(empId.matches("EMP[0-9]{3}")){
            this.empId=empId;
            System.out.println("emp id is valid : "+empId);
        }
        else{
            System.out.println("emp id is not valid");
        }
    }
    public String getId(){
        return empId;
    }

    // emp name 
    public void setName(String name){
        if(name!=null && name.matches("[a-zA-Z ]{3,}")){
            this.name=name;
            System.out.println("name is valid");
        }
        else{
            System.out.println("name is not valid");
        }
    }
    
    public String getName(){
        return name;
    }

    // salary
    public void setSalary(double salary){
        if(salary >10000){
            this.salary=salary;
        }
        else{
            System.out.println("salary amout is invalid");
        }
    }
    public double getSalary(){
        return salary;
    }

    // Department
    public void setDepartment(String department){
        if(department.matches("HR|IT|SALES")){
            this.department=department;
        }
        else{
            System.out.println("Department is invalid so not allowed :");
        }
    }

    public String getDepartment(){
        return department;
    }

    public void displayEmployee(){
        System.out.println("Emmployee id:"+empId);
        System.out.println("Emmployee name:"+name);
        System.out.println("Emmployee salary:"+salary);
        System.out.println("Emmployee Department:"+department);
    }
}


public class MiniProject {
    public static void main(String[] args){
        Employee e1=new Employee("EMP101","Pushkaraj",12000.34,"IT");
        e1.displayEmployee();
    }
}

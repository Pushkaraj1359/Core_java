package collection.hasSetProjects.employeeSystem;

public class Employee {
    int Empid;
    String Empname;
    double Empsalary;

    Employee(int Empid,String Empname,double Empsalary){
        this.Empid=Empid;
        this.Empname=Empname;
        this.Empsalary=Empsalary;
    }
    void displayEmployee(){
        System.out.println("Employee id : "+Empid);
        System.out.println("Employee name :"+Empname);
        System.out.println("Employee salary :"+Empsalary);
    }
}

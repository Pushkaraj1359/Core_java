package employeeSystem;

public class Employee {
    int empId;
    String empName;
    int empSalary;

    public Employee(int empId,String empName,int empSalary){
        this.empId=empId;
        this.empName=empName;
        this.empSalary=empSalary;
    }

    void displayEmployees(){
        System.out.println("Employee Id :"+empId);
        System.out.println("Employee Name :"+empName);
        System.out.println("Employee Salary :"+empSalary);
        System.out.println("--------------------------------");
    }
}

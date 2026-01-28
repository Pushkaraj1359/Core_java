package complexArray;
import java.util.Scanner;

class employee{
    private int id;
    private String name;
    private double monthlySalary;
    private int leaveDays;

    employee(int id,String name,double monthlySalary,int leaveDays){
        this.id=id;
        this.name=name;
        this.monthlySalary=monthlySalary;
        this.leaveDays=leaveDays;
    }

    double calAnnualPackage(){
        double dailySalary = monthlySalary / 30;
        double leaveDeduction = dailySalary * leaveDays;
        double annualPackage = (monthlySalary * 12) - leaveDeduction;
        return  annualPackage;
    }

    void displayEmployeeDetails() {
        System.out.println("ID: " + id);
        System.out.println(" Name: " + name);
        System.out.println("Monthly Salary : " + monthlySalary);
        System.out.println("Leave Days : " + leaveDays);
        System.out.println("Annual Package (after leaves) : " + calAnnualPackage());
    }
}

public class c_employee {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("tne no of employee : ");
        int n = scanner.nextInt();

        scanner.nextLine();

        employee[] employees =  new employee[n];

        for(int i=0;i<n;i++){
            System.out.println(" Enter details for employee :");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // consume newline

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Monthly Salary: ");
            double salary = scanner.nextDouble();

            System.out.print("Number of leave days in year : ");
            int leaves = scanner.nextInt();
            employees[i] = new employee(id, name, salary, leaves);
        }

        for (employee emp : employees) {
            emp.displayEmployeeDetails();
        }
    }
}

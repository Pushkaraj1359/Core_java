package employeeSystem;

public class Main {
    public static void main(String[] args) {
        EmployeeManager manager = new EmployeeManager();

        Employee e1 = new Employee(1, "Jay",64900);
        Employee e2 = new Employee(2, "Shree",97900);
        Employee e3 = new Employee(3, "Ram",80900);
        Employee e4 = new Employee(4,"Pushkaraj",50000);


        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);
        manager.addEmployee(e4);
        manager.displayAllEmployees();
        
        manager.searchEmployee(4);
        manager.deleteEmployee(4);
        System.out.println("after delete Employee e4 :");
        manager.displayAllEmployees();

        
    }
}

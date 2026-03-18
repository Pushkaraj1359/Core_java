package collection.hasSetProjects.employeeSystem;
import java.util.HashSet;

public class EmployeeManager {
    HashSet<Employee> employee = new HashSet<Employee>();

    // add employee
    void addEmployee(Employee e){
        employee.add(e);
    }

    // display add employee
    void displayAllEmployee(){
        for(Employee e : employee){
            e.displayEmployee();
        }
    }

    // search Employee
    Employee searchEmployee(int id){
        for(Employee e : employee){
            if(e.Empid == id){
                return e;
            }
        }
        return null;
    }

    // delete employee
    void deleteEmpById(int id){
        for(Employee e : employee){
            if(e.Empid == id){
                e.displayEmployee();
            }
            else{
                System.out.println("Employee not found...");
            }
        }
    }


}

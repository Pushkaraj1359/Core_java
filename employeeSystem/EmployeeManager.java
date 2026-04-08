package employeeSystem;

public class EmployeeManager {
    Employee[] employees = new Employee[5];
    int count = 0;

    void addEmployee(Employee employee){
        employees[count]= employee;
        count++;
    }

    void displayAllEmployees(){
        for(int i=0;i<count;i++){
            employees[i].displayEmployees();
        }
    }

    void searchEmployee(int empId){
        System.out.println("Employee Found :");
        for(int i=0;i<count;i++){
            if(employees[i].empId == empId){
                employees[i].displayEmployees();
            }
        }
    }

    void deleteEmployee(int empId){
        for(int i=0;i<count;i++){
            if(employees[i].empId == empId){
                for(int j=i;j<count-1;j++){
                    employees[j]=employees[j+1];
                }
                count--;
            }
        }
    }
}

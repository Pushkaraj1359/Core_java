package complexArray;
import java.util.Scanner;

class employee{
    private int id;
    private String name;
    private double salary;

    employee(int id, String name, double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    // getter
    // setter

    int getId(){
        return id;
    }

    String getName(){
        return name;
    }

    double getSalary(){
        return salary;
    }

    void employeeDetails(){
        System.out.println("id "+id);
        System.out.println("name "+name);
        System.out.println("salary "+salary);
    }
}


public class B_test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of employee");
        int size = scanner.nextInt();
        employee[] emList=new employee[size];

        for(int i=0;i<emList.length;i++){
            System.out.println("enter id");
            int id = scanner.nextInt();
            System.out.println("enter name");
            scanner.nextLine(); // omitt your white space charater enter...
            String name = scanner.nextLine();
            System.out.println("enter salary");
            double salary = scanner.nextDouble();
            emList[i] = new employee(id,name,salary);
        }

        // to display all employee 
        for(employee emp : emList){
            emp.employeeDetails();
        }
        
    }
}

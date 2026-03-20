package collection.hasSetProjects.employeeSystem;

public class Main {
    public static void main(String[] args){
        EmployeeManager manager = new EmployeeManager();

        Employee e1 = new Employee(1, "Pushkaraj", 7673920);
        Employee e2 = new Employee(2, "deepak", 6464430);
        // Employee e5 = new Employee(2, "deepak", 6464430);
        Employee e3 = new Employee(3, "dheeraj", 7895033);
        Employee e4 = new Employee(1, "Suyash", 677969400);

        manager.addEmployee(e1);
        manager.addEmployee(e2);
        manager.addEmployee(e3);
        manager.addEmployee(e4);
       // manager.addEmployee(e5);

        manager.displayAllEmployee();
    }
}

package EmployeeManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee("101",
                "nitish singh",10000,2000);
        fullTimeEmployee.assignDepartment("javaaaaa");
        FullTimeEmployee fullTimeEmployee1 = new FullTimeEmployee("102","siddhhu",15000,1000);
        fullTimeEmployee1.assignDepartment("ai");
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee("103","babu",8000,5,500);
        partTimeEmployee.assignDepartment("cse");
        PartTimeEmployee partTimeEmployee1 = new PartTimeEmployee("123","neha",10000,3,1000);
        partTimeEmployee1.assignDepartment("cse");

        employees.add(fullTimeEmployee);
        employees.add(fullTimeEmployee1);
        employees.add(partTimeEmployee);
        employees.add(partTimeEmployee1);


        for (Employee e:employees
             ) {
            e.displayDetails();
            System.out.println("total salary is "+ e.calculateSalary());
            System.out.println("department name is " + ((Department) e).getDepartmentDetails());
            System.out.println("----------------------------");

        }
    }
}

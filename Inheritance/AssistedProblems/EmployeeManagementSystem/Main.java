package EmployeeManagementSystem;

public class Main {
    public static void main(String[] args) {


//        Employee employee = new Employee();
        Employee getEmployee = new Employee("nitish", "101", 5000);
        Manager manager = new Manager("siddhu","101",5000,5);
        Developer developer = new Developer("sir", "102",8000,"java");
        Intern intern = new Intern("neha", "105",10000,6);


        getEmployee.displayDetails();
        System.out.println();

        manager.displayDetails();
        System.out.println();
        developer.displayDetails();
        System.out.println();
        intern.displayDetails();
    }
}

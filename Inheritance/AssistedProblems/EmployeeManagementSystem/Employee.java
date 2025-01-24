package EmployeeManagementSystem;

public class Employee {
    private String name;
    private String id;
    private double salary;



    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("employee name is "+ name + " .ID is  "+ id +
                " salary getting is "+ salary);
    }
}

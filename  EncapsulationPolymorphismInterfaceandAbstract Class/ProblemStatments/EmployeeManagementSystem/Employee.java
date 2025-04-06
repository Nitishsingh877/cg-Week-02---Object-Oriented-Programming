package EmployeeManagementSystem;

abstract class Employee {
    private String employeeId;
    private String name;
    private double baseSalary;
//constructor
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
//getter-setter
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //abstract method does not contain body
    abstract double calculateSalary();

    //displayDetails- concrete methods
    public  void displayDetails(){
        System.out.println("employee name is "+ name);
        System.out.println("employee id is " + employeeId);
        System.out.println("base salary is " + baseSalary);
    }

}

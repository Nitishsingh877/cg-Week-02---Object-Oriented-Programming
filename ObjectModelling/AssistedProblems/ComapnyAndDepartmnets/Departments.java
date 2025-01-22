package ComapnyAndDepartmnets;

import java.util.ArrayList;

public class Departments {
    private String departmentName;
    private String departmentID;
    private ArrayList<Employee> employees;

    public Departments(String departmentName, String departmentID) {
        this.departmentName = departmentName;
        this.departmentID = departmentID;
        employees = new ArrayList<>();
    }
    public void addEmployee(Employee e) {
        employees.add(e);
    }
    public void getDepartment() {
        System.out.println("name of department "+ departmentName);
        System.out.println("name of department id "+ departmentID);
    }
    public void getEmployees() {
        for (Employee e: employees) {
            e.getemployeeDetails();
            System.out.println();
        }
    }

}

package EmployeeManagementSystem;

public class PartTimeEmployee extends Employee implements Department{
    private String departmentName;
    private int workHours;
    private int incentivePerHours;

    public PartTimeEmployee(String employeeId, String name, double baseSalary, int workHours, int incentivePerHours) {
        super(employeeId, name, baseSalary);
        this.workHours = workHours;
        this.incentivePerHours = incentivePerHours;
    }

    @Override
    double calculateSalary() {
        return super.getBaseSalary()+ (workHours*incentivePerHours);
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return departmentName;
    }
}

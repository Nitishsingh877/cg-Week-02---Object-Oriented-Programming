package EmployeeManagementSystem;

public class FullTimeEmployee extends  Employee implements  Department{
    private int incentives;
    private String deptName;

    public FullTimeEmployee(String employeeId, String name, double baseSalary, int incentives) {
        super(employeeId, name, baseSalary);
        this.incentives = incentives;
//        this.deptName = departmentName;
    }

    @Override
    double calculateSalary() {
        return  super.getBaseSalary()+incentives;
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.deptName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        return deptName;
    }
}

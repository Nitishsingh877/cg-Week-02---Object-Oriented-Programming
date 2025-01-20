public class EmployeeRecords {
    public static void main(String[] args) {
        Employee guest = new Employee();
        guest.displayDetails();

        Employee nitish = new Employee(1001,"cse",800);
        nitish.displaySalary();
        nitish.modifysalary(8000);
        nitish.displayDetails();


        Manager siddhu = new Manager(100, "cse-ai",8000);
        siddhu.displayUsingSubClass();
    }
}

class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    Employee() {
        employeeID = 1;
        department = "medical";
        salary = 100;
    }
    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public  void modifysalary(double updatedSalary) {
        salary = updatedSalary;
    }
    void  displaySalary() {
        System.out.println("salary is " + salary);
    }
    void  displayDetails() {
        System.out.println("employee id is "+ employeeID);
        System.out.println("department is "+ department);
        System.out.println("Salary is $"+ salary);
    }
}

class Manager extends  Employee {

    Manager(int employeeID, String department, double salary) {
        super(employeeID,department,salary);
    }
    void displayUsingSubClass() {
        System.out.println("employee id is "+ employeeID);
        System.out.println("department is "+ department);
    }
}

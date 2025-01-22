package ComapnyAndDepartmnets;

public class Main {
    public static void main(String[] args) {


        Company cg = new Company("capagemini", 101);
        Departments d1 = new Departments("cse-aiml", "101");
        Departments d2 = new Departments("java full stack", "102");

        Employee nitish = new Employee("nitish ", 103);
        Employee siddhu = new Employee("siddhu", 104);
        Employee harsh = new Employee("harsh", 105);

        //adding employee
        d1.addEmployee(nitish);
        d1.addEmployee(siddhu);
        d1.addEmployee(harsh);
        d2.addEmployee(harsh);
        d2.addEmployee(nitish);


        //adding dept to company
        cg.addDepartment(d1);
        cg.addDepartment(d2);
// for getting  employee and company details
//        d1.getEmployees();
//        d2.getEmployees();
//        cg.getCompanyDetails();

        cg = null;
        d1.getEmployees();
        cg.getCompanyDetails();

    }
}

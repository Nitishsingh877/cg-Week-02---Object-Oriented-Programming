public class DisplayEmployee {
    public static void main(String[] args) {
        //create employee objects
        Employee employee1 = new Employee("nitish", 123, 5790.89);
        Employee employee2 = new Employee("singh", 456, 5473);

//        display result
        System.out.println("---emp1Details---");
        employee1.displayDetails();
        System.out.println("-----emp2Details----");
        employee2.displayDetails();

    }
}
class Employee {
    //attribute
    private  String name;
    private  int id;
    private  double Salary;

    //constructor
    public  Employee(String name, int id,double Salary) {
        this.name = name;
        this.id = id;
        this.Salary = Salary;
    }

    //    display employee details
    public void displayDetails() {
        System.out.println("name " + name);
        System.out.println("id : " + id);
        System.out.println("Salary is " + Salary);
    }
}


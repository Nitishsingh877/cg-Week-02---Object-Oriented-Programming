public class EmployeeMangementSystem {
    public static void main(String[] args) {
        Employee e1 = new Employee("nitish singh",101,"executive");
        Employee e2 = new Employee("siddhu sinmgh", 102, "senior excutive");
        e1.displaydata();
        e2.displaydata();
        Employee.displayTotalEmployee();

        if(e1 instanceof Employee) {
            System.out.println("yes it was insatmce of Employee");
        }
    }
}

class Employee {
    private static String companyName;
    public static int count =0;

    private final int id;
    private String name;
    private String designation;


    Employee(String name, int id, String designation) {
        this.name = name;
        this.id =id;
        this.designation =designation;
        count++;
    }
    public static void displayTotalEmployee() {
        System.out.println("total employee are "+ count);
    }


    void displaydata() {
        System.out.println("name is "+ name);
        System.out.println("id is "+ id);
        System.out.println("desingnation is "+ designation);
    }
}



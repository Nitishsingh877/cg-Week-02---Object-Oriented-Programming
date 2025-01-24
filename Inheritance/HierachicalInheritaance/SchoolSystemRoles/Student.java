package SchoolSystemRoles;

public class Student extends  Person{
    private  String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Student");
    }

    @Override
    public void getRoleDetails() {
        super.getRoleDetails();
        System.out.println("grade is "+ grade);
    }
}

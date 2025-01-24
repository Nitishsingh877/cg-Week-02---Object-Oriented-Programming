package SchoolSystemRoles;

public class Teacher extends  Person{
    private String  subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Teacher");
    }

    @Override
    public void getRoleDetails() {
        super.getRoleDetails();
        System.out.println("subject is "+ subject);
    }
}

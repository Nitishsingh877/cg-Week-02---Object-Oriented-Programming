package SchoolSystemRoles;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("nitish ",18);
        Teacher teacher = new Teacher("siddhu",20,"maths");
        Student student = new Student("neha",56,"A");
        Staff staff = new Staff("abbc",20,8);

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();

        teacher.getRoleDetails();
        staff.getRoleDetails();
        student.getRoleDetails();
    }
}

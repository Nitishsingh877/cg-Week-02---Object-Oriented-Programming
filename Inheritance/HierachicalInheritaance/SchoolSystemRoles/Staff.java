package SchoolSystemRoles;

public class Staff extends Person {
    private int dutyHours;

    public Staff(String name, int age, int dutyHours) {
        super(name, age);
        this.dutyHours = dutyHours;
    }

    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Staff");
    }

    @Override
    public void getRoleDetails() {
        super.getRoleDetails();
        System.out.println("duty hours is "+ dutyHours);
    }
}

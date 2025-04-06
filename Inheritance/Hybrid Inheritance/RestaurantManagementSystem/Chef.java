package RestaurantManagementSystem;

public class Chef extends Person implements Worker {
    private String speciality;

    public Chef(String name, int id, String speciality) {
        super(name, id);
        this.speciality = speciality;
    }

    @Override
    public void performDuties() {
        System.out.println("Duties: Preparing meals, designing menus, and ensuring food quality.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("role is chef");
        System.out.println("special in"+ speciality);
    }
}

package RestaurantManagementSystem;

public class Waiter extends Person implements Worker{

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("waiter role is to take orders");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("role is waiter");
    }
}

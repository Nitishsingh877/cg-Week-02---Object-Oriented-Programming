package RestaurantManagementSystem;

public class Main {
    public static void main(String[] args) {

        Chef chef = new Chef("panchu", 101, "non-veg");
        chef.performDuties();
        chef.displayDetails();

        System.out.println();

        Waiter waiter = new Waiter("babu",202);
        waiter.displayDetails();
        waiter.performDuties();
    }
}

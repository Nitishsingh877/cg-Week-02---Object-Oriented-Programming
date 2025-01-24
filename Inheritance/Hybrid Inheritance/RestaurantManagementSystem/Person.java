package RestaurantManagementSystem;

public class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

   public void displayDetails() {
       System.out.println("name is "+ name);
       System.out.println("id is "+ id);
   }



}

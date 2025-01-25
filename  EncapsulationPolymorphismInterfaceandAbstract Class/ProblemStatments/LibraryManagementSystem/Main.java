package LibraryManagementSystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();


        Book b1 = new Book(101,"nitish",true);
        Magazine m1 = new Magazine(102,"singh",false);
        DVD d1 = new DVD(104,"siddhu",true);

        libraryItems.add(b1);
        libraryItems.add(m1);
        libraryItems.add(d1);

        for (LibraryItem l:libraryItems
             ) {
            l.displayDetails();
            System.out.println("Loan durations : "+ l.getLoanDuration() + " days.");

            if(l instanceof Reservable){
                Reservable reservable = (Reservable) l;
                System.out.println("avilablity for reservation "+ (reservable.checkAvailability() ? "Available":"not available"));

                // Attempt to reserve the item
                reservable.reserveItem("John Doe", "1234-5678");
                System.out.println("Availability after reservation: " + (reservable.checkAvailability() ? "Available" : "Unavailable"));
            }

            if(l instanceof  Book){
                ((Book)l).getBorrowerDetails();
            }
            System.out.println("-------------------");
        }
    }
}

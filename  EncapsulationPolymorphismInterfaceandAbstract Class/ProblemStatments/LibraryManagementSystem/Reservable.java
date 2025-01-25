package LibraryManagementSystem;

public interface Reservable {
    void reserveItem(String borrowerName, String borrowerContact);
    boolean checkAvailability();

}

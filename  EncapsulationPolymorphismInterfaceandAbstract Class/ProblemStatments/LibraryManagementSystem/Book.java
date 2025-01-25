package LibraryManagementSystem;

public class Book extends LibraryItem implements  Reservable{
    private boolean isAvailable;
    private String borrowerName;
    private String borrowerContact;

    public Book(int itemID,  String author, boolean isAvailable) {
        super(itemID, "Book", author);
        this.isAvailable = true;
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }

    @Override
    public void reserveItem(String borrowerName, String borrowerContact) {
        if(isAvailable){
            this.borrowerName = borrowerName;
            this.borrowerContact = borrowerContact;
            isAvailable = false;
            System.out.println("borrower name is " + borrowerName);
        }else {
            System.out.println("already borrowed");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
    // Encapsulation to secure borrower details
    private String maskBorrowerContact() {
        return borrowerContact != null ? "****-****-" + borrowerContact.substring(borrowerContact.length() - 4) : "N/A";
    }

    public void getBorrowerDetails() {
        if (!isAvailable) {
            System.out.println("Borrower Name: " + borrowerName);
            System.out.println("Borrower Contact: " + maskBorrowerContact());
        } else {
            System.out.println("No borrower details available.");
        }
    }
}

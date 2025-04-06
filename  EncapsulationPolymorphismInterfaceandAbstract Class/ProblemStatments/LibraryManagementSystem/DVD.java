package LibraryManagementSystem;

public class DVD extends LibraryItem implements  Reservable {
    private boolean isavilable;

    public DVD(int itemID, String author, boolean isavilable) {
        super(itemID, "DVDs", author);
        this.isavilable = isavilable;
    }

    @Override
    public int getLoanDuration() {
        return 3;
    }

    @Override
    public void reserveItem(String borrowerName, String borrowerContact) {
        if(isavilable){
            System.out.println("borrower name is " + borrowerName);
        }else {
            System.out.println("not available for borrow");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isavilable;
    }
}

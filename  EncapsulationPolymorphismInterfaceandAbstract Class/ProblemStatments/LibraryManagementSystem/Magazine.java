package LibraryManagementSystem;

public class Magazine extends  LibraryItem implements  Reservable {
    private  boolean isavilable;

    public Magazine(int itemID, String author, boolean isavilable) {
        super(itemID, "Magazine", author);
        this.isavilable = isavilable;
    }

    @Override
    public int getLoanDuration() {
        return 15;
    }

    @Override
    public void reserveItem(String borrowerName, String borrowerContact) {
        if(isavilable){
            System.out.println("borrwer name is "+ borrowerName);
        }else {
            System.out.println("not avilable to borrow");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isavilable;
    }
}

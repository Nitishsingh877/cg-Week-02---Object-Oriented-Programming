package LibraryManagementSystem;

abstract class LibraryItem {
    private int itemID;
    private  String title;
    private String author;

    public LibraryItem(int itemID, String title, String author) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    //abstract  methods
     public  abstract int getLoanDuration();

    //concrete method
    public void displayDetails(){
        System.out.println("item id is "+ getItemID());
        System.out.println("item name is " + getTitle());
        System.out.println("item author is " + getAuthor());
    }


}

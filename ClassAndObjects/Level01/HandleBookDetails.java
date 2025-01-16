
public class HandleBookDetails {
    public static void main(String[] args) {
        //crete object
        Book book1 = new Book("Java A love Story", "nitish singh", 99.00);
        book1.DisplayDetails();
    }
}
class Book {
    //    attribute
    private String title;
    private String author;
    private double price;

    //    constructor creation
    public  Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;

    }

    //display details
    public  void DisplayDetails() {
        System.out.println("the book with name " + title + "written by "+ author + " comes with price " + price + " only.");
    }
}



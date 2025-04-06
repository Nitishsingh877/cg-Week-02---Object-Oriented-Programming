public class BookSystem {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println("book 1 using default const");
        b1.DisplayBook();

        Book b2 =  new Book("hello kitty","ntish singh",999.00);
        System.out.println("book2 using parametrised constructor");
        b2.DisplayBook();



    }
}

class Book {
    //attributes
    private String title;
    private String author;
    private  double price;

    //default constructor
    Book() {
        title = "once upon a time";
        author = "nitish singh";
        price = 99.00;
    }

    //parametrized constructor
    Book(String title,String author, double price) {
        this.title = title;
        this.author =author;
        this.price = price;
    }

    void DisplayBook() {
        System.out.println("the title is "+ title);
        System.out.println("the author is " + author);
        System.out.println("the price is  "+ price);
    }

}

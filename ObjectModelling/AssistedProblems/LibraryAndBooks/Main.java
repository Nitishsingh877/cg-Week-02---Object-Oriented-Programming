package LibraryAndBooks;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("never alone","nitish singh");
        Book b2 = new Book("always alone", "siddhu singh");
        Book b3 = new Book("not alone","harshveer singh");

        //create libraries

        Library l1 = new Library("city Library");
        Library l2 = new Library("community Library");

        //add books to library
        l1.addBook(b1);
        l1.addBook(b2);

        l2.addBook(b2); //same book can exist in multiple library
        l2.addBook(b3);

        //display books
        l1.displayBooks();
        l2.displayBooks();
    }
}


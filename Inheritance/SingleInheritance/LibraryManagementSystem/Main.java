package LibraryManagementSystem;

public class Main {
    public static void main(String[] args) {
        Author author =  new Author("nitish singh","a good book for people who found themselves alone");
        Book book = new Book("alone always",2025,author);

        book.displayInfo();

    }
}

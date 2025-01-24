package LibraryManagementSystem;

public class Book {
    private String title;
    private int publicationYear;
    private Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    public void displayInfo(){
        System.out.println("book name is "+ title);
        System.out.println("publication year is "+ publicationYear);
        author.displayInfo();
    }
}

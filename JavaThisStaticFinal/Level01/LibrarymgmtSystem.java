public class LibrarymgmtSystem {
    public static void main(String[] args) {
        Book b1 = new Book("never alone","nitish singh","dcdjkjvdsd-j696");
        Book.setLibraryName("CG-Labs");
        b1.displayData();
        Book b2 = new Book("hii i am jack","sidhdu singh", "65949dsjc");
        b2.displayData();
        if(b1 instanceof  Book) {
            System.out.println("yes it is an instance of book class");
        }
        if(b2 instanceof  Book) {
            System.out.println("yes it is an instance of book class");
        }
    }
}

class Book {
    private  static String libraryName; //static variable
    private String title;
    private String author;
    private final String Isbn;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.Isbn = isbn;
    }

    public static void setLibraryName(String newLibraryName) {
        libraryName = newLibraryName;
    }
//     public  static void displayLibraryNames() {
//        System.out.println("library name is "+ libraryName);
//    }


    public  void displayData() {
        System.out.println("title is " + title);
        System.out.println("author is " + author);
        System.out.println("isbn for book is " + Isbn);
        System.out.println("library name is "+ libraryName);
    }




}

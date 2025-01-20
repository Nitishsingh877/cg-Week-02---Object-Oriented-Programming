public class BookLibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.displayDetails();

        Book b2 = new Book("11-233-5450", "never alone", "nitish singh");
        b2.displayAuthorName();
        b2.setAuthorName("satish singh");
        b2.displayAuthorName();
        b2.displayDetails();

        EBook eb1 = new EBook("12212.dvmdvdsv-vknff", "siddhu singh lone warrior","siddhu singh" );
        eb1.displayUsingSubClass();

    }
}

class Book {
    public String ISBN;
    protected String title;
    private String author;

    //constructor
    Book() {
        ISBN = "111-23--45-6";
        title = "better alone";
        author = "prajakta kohli";
    }

    Book(String ISBN, String title, String author) {
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
    }

    void displayAuthorName () {
        System.out.println("author name is "+ author);
    }
    public void setAuthorName(String authorName){
        author = authorName;
    }

    void  displayDetails() {
        System.out.println("ISBN is "+ ISBN);
        System.out.println("title is "+ title);
        System.out.println("author name is" + author);
    }
}

class EBook extends Book {

    EBook(String ISBN, String title, String author) {
        super(ISBN, title, author);
    }
        void displayUsingSubClass(){
            System.out.println("isbn is "+ ISBN);
            System.out.println("title is "+ title);
            //cant access author due to private

        }
    };


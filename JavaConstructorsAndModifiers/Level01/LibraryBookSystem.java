public class LibraryBookSystem {
    public static void main(String[] args) {
        library book1 = new library("the great game","harper lee", 899,true);
        library book2 = new library("learn to be alone", "prajakta kohli" ,899, true);

        //display details
        System.out.println("display details for book1");
        book1.displayResult();
        System.out.println("\ndisplay details for book2");
        book2.displayResult();

        //borrow first book
        System.out.println("\n");
        book1.borrowBook();
        System.out.println("");

        //book1 again borrow
        book1.borrowBook();
        System.out.println();

        //book2 borroe
        book2.borrowBook();
        System.out.println();

        //again b2 borrow
        book2.borrowBook();
        System.out.println();

    }
}

class library {
    //attributes
    private String title;
    private String author;
    private int price;
    private  boolean availability;

    public  library(String title, String author, int price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    void displayResult () {
        System.out.println("the title is " + title);
        System.out.println("the author is "+ author);
        System.out.println("the price is $" + price);
        System.out.println("Availability: " + (availability ? "Available" : "Not Available"));
    }


    //method to borrow book
    public  boolean borrowBook() {
        if(availability) {
            availability = false;
            System.out.println("you have succesfully borrowed the book "+ title);
            return true;
        }else  {
            System.out.println("the book is not avavilable " + title);
            return false;
        }
    }


}

package LibraryAndBooks;

class Book {
    //attributes
    private String title;
    private String author;

    //constructor


    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return  title;
    }
    public String getAuthor() {
        return author;
    }
    public String toString() {
        return "book{" + "title = ' "+ title + '\'' + " , author= ' "+ author+ '\'' + '}';
    }
}


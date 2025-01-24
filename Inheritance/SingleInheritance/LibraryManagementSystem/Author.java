package LibraryManagementSystem;

public class Author{
    private String name;
    private String bio;

    public Author(String name, String bio) {
       this.name = name;
        this.bio = bio;
    }
    public void displayInfo() {
        System.out.println("name of author is "+ name);
        System.out.println("bio for this book is "+ bio);
    }
}

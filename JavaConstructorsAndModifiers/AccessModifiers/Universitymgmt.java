import java.util.concurrent.Callable;

public class Universitymgmt {
    public static void main(String[] args) {
        Student S1 = new Student(101,"nitish singh",7.55);
        S1.cgpaDisplay();
        S1.updateCGPA(8.09);
        S1.cgpaDisplay();
        S1.DisplayDetails();

        PostgraduateStudent p1 = new PostgraduateStudent(102,"siddhu singh",8.55,"aiMl");
        p1.displayInSubClass();
    }
}

class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;

    //constructor
    Student() {
        rollNumber = 0;
        name = "guest";
        CGPA = 7.55;
        };

    Student(int rollNumber,String name,double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA =CGPA;
    }

    void cgpaDisplay () {
        System.out.println("cgpa is " + CGPA);
    }
    public  void updateCGPA(double updatedCgpa) {
        CGPA = updatedCgpa;
    }
    void DisplayDetails() {
        System.out.println("roll number is "+ rollNumber);
        System.out.println("name is "+ name);
        System.out.println("cgpa is " + CGPA);
    }

}

class PostgraduateStudent  extends  Student {
    private String stream;

    PostgraduateStudent(int rollNumber, String name,double CGPA, String stream) {
        super(rollNumber,name,CGPA);
        this.stream = stream;
    }

    void displayInSubClass() {
        System.out.println("roll number is "+ rollNumber);
        //accessing name because of protexted
        //cant access cgpa becausee of private
        System.out.println("name is " + name);
        System.out.println("steam is " + stream);
    }
}

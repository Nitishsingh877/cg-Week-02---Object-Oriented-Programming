import java.util.Scanner;

public class SimulateStudentReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        String name = sc.nextLine().trim();
        System.out.println("enter roll num");
        int rollNum = sc.nextInt();
        System.out.println("enter marks");
        int marks = sc.nextInt();

//        object creation
        Student s1 = new Student(name, rollNum,marks);
        s1.Grades(marks);
        s1.DispStudent();

    }
}

class Student {
    private String name;
    private int rollNum;
    private int marks;

    public Student(String name, int rollNum, int marks) {
        this.marks= marks;
        this.rollNum = rollNum;
        this.marks = marks;
    }
    public String Grades(int marks) {
        if(marks>=80){
            return "outstanding";
        } else if (marks>50 && marks<80) {
            return "average student";
        }else {
            return "need to learn hard";
        }
    }
    public  void DispStudent() {
        System.out.println("marks is "+ marks+ "\nrollnumber is " + rollNum + "\nmarks is "+ marks + "\n grades for this marks is "+
                Grades(marks));
    }
}

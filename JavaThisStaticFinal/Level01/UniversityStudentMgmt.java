public class UniversityStudentMgmt {
    public static void main(String[] args) {
        Students nitish = new Students("nitish singh",101,"a+");
        Students siddhu = new Students("siddhu singh",102,"c+");
        Students ansi = new Students("ansi patel", 103 , "a++");

        Students.setUniversityNames("TIOT");
        Students.displayTotalStudents();

        nitish.getDetails();
        System.out.println("\n");
        siddhu.getDetails();
        System.out.println("\n");
        ansi.getDetails();

    }
}

class Students {
    private static int totalStudents = 0;
    private static String universityNames;
    private String name;
    private final int rollNumber;
    private String grade;

    //constructor
    public  Students(String name, int rollNumber, String grade){
        this.name= name;
        this.rollNumber =rollNumber;
        this.grade =grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println("total students enrolled are " + totalStudents);
    }

    public static void setUniversityNames(String newUnivNames) {
        universityNames =newUnivNames;
    }

    public void getDetails() {
        System.out.println("name is "+ name);
        System.out.println("roll number is "+ rollNumber);
        System.out.println("grade is "+ grade);
        System.out.println("university name is "+ universityNames);
    }


}

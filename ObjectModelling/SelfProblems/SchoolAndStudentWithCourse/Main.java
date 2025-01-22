package SchoolAndStudentWithCourse;

public class Main {
    public static void main(String[] args) {
        School tit = new School("TIOT");

        //course
        Course aiml = new Course("aiml");
        Course fullStack = new Course("fullStack");
        Course java = new Course("java");

        //students
        Student nitish = new Student("nitish",101);
        Student siddhu = new Student("siddhu",102);
        Student rani = new Student("rani",103);
        Student neha = new Student("neha",104);

        //add student in course
        nitish.enrollCourse(aiml);
        nitish.enrollCourse(java);
        siddhu.enrollCourse(fullStack);
        rani.enrollCourse(java);
        neha.enrollCourse(fullStack);

        //view student course
        java.getCourseDetails();
        fullStack.getCourseDetails();
        aiml.getCourseDetails();


        //display course studnt
        nitish.displayStudentCourseDetails();
        siddhu.displayStudentCourseDetails();
        rani.displayStudentCourseDetails();
        neha.displayStudentCourseDetails();
    }
}

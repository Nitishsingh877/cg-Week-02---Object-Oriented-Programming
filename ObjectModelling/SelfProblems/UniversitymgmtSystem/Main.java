package UniversitymgmtSystem;

public class Main {
    public static void main(String[] args) {
        Professor p1 = new Professor("nirish");
        Professor p2 = new Professor("sigh");

        //course
        Course c1 = new Course("maths","7");
        Course c2 = new Course("physics", "9");
        Course c3 = new Course("xse" ,"9");

        //student
        Student s1 = new Student("ram");
        Student s2 = new Student("shyam");
        Student s3 = new Student("radha");
        //assign course to professor
        p1.teachCourse(c1);
        p2.teachCourse(c3);

        //student enroll in course
        s1.enrollCourse(c2);
        s1.enrollCourse(c1);
        s2.enrollCourse(c3);
        s2.enrollCourse(c3);
        s3.enrollCourse(c1);

        //show details
        c1.showCourseDetails();
        System.out.println();
        c2.showCourseDetails();
        System.out.println();
        c3.showCourseDetails();
        System.out.println();

        p1.showTeachingDetails();
        System.out.println();
        p2.showTeachingDetails();
        System.out.println();

        s1.showEnrollmentDetails();
        System.out.println();
        s2.showEnrollmentDetails();
        System.out.println();
        s3.showEnrollmentDetails();

    }
}

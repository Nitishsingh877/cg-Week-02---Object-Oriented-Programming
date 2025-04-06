package SchoolAndStudentWithCourse;

import java.util.ArrayList;

public class Student {
    private String studentName;
    private int rollNum;

    private ArrayList<Course> courseArrayList;

    public Student(String studentName, int rollNum) {
        this.studentName =studentName;
        this.rollNum =rollNum;
        courseArrayList =new ArrayList<>();
    }

    public void enrollCourse(Course c) {
        courseArrayList.add(c);
        c.enrollStudent(this); //association : student enroll in course
    }
    public void getStudentDetails() {
        System.out.println("name is "+ studentName);
        System.out.println("roll num is "+ rollNum);
    }
    public void displayStudentCourseDetails() {
        System.out.println("name is "+ studentName);
        System.out.println("roll num is "+ rollNum);
        System.out.println("courses :");
        for (Course c:courseArrayList
             ) {
            c.getCourse();
        }
        System.out.println();
    }


}

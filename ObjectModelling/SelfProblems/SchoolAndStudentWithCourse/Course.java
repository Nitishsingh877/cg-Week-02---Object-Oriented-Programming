package SchoolAndStudentWithCourse;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Student> students;

    public Course(String courseName){
        this.courseName =courseName;
        students = new ArrayList<>();
    }

    public void enrollStudent(Student s) {
        students.add(s);
    }
    public void getCourse() {

        System.out.println("course name is "+ courseName);
    }

    public void getCourseDetails() {
        System.out.println("course name is "+ courseName);
        System.out.println("student enrolled ");

        for (Student s:students) {
            s.getStudentDetails();
        }
        System.out.println();
    }


}

package UniversitymgmtSystem;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Course> courseArrayList;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void enrollCourse(Course course) {
        if (!courseArrayList.contains(course)) {
            courseArrayList.add(course);
            course.enrolledStudents(this); // Bi-directional association
        }
    }

    public void showEnrollmentDetails() {
        System.out.println("Student: " + name);
        System.out.println("Enrolled Courses:");
        for (Course course : courseArrayList) {
            System.out.println(" - " + course.getCourseName());
        }
    }
}
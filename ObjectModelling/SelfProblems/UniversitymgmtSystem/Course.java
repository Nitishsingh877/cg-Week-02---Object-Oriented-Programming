package UniversitymgmtSystem;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String courseDuration;
    private ArrayList<Student> studentArrayList;
    private Professor professor;

    public Course(String courseName, String courseDuration) {
        this.courseName = courseName;
        this.courseDuration = courseDuration;
        studentArrayList = new ArrayList<>();
    }

    public String getCourseName() {
        return courseName;
    }

    public void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println(professor.getName() + "professor has been assingned " + courseName);
    }

    public void enrolledStudents(Student student) {
        if (!studentArrayList.contains(student)) {
            studentArrayList.add(student);
            System.out.println(student.getName() + " has enrolled in " + courseName);
        }
    }

    public void showCourseDetails() {
        System.out.println("Course: " + courseName);
        if (professor != null) {
            System.out.println("Professor: " + professor.getName());
        } else {
            System.out.println("Professor: Not assigned");
        }
        System.out.println("Enrolled Students:");
        for (Student student : studentArrayList) {
            System.out.println(" - " + student.getName());
        }
    }
}

package EducationalCourseHierarchy;

public class Course {
    private String courseName;
    private int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public void displayCourse(){
        System.out.println("course name is "+ courseName);
        System.out.println("course duration is"+ duration);
    }
}

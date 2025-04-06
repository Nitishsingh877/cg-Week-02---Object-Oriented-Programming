package EducationalCourseHierarchy;

public class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public void displayCourse() {
        super.displayCourse();
        System.out.println("platform is "+ platform);
        System.out.println("lecture is recorded ?"+ isRecorded);
    }
}

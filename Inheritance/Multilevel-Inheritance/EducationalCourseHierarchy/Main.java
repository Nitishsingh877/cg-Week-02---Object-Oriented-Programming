package EducationalCourseHierarchy;

public class Main {
    public static void main(String[] args) {
        Course course = new Course("ai",6);
        course.displayCourse();
        System.out.println();

        OnlineCourse onlineCourse = new OnlineCourse("ai",6,"coursera",true);
        onlineCourse.displayCourse();
        System.out.println();

        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("ai",6,"coursera",true,10000,10);
        paidOnlineCourse.getFeeAfterDiscount();
        paidOnlineCourse.displayCourse();

    }

}

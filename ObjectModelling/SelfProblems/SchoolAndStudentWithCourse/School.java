package SchoolAndStudentWithCourse;

import java.util.ArrayList;

public class School {
    private String schoolName;

    ArrayList<Student> students;

    public School(String schoolName){
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    public void getSchoolName() {
        System.out.println("school name is "+ schoolName);
    }

    public void enrollInSchool(Student p) {
        students.add(p);
    }

}

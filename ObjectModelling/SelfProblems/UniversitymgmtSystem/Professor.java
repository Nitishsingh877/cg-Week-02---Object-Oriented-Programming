package UniversitymgmtSystem;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Professor {
    private String Name;

    private ArrayList<Course> courseArrayList;

    public Professor(String Name){
        this.Name = Name;
        courseArrayList = new ArrayList<>();
    }

    public String getName(){
        return Name;
    }

    public void teachCourse(Course c){
        if (!courseArrayList.contains(c)) {
            courseArrayList.add(c);
            c.assignProfessor(this); // Bi-directional association
        }
    }
    public void showTeachingDetails(){
        System.out.println("Professor  "+ getName());
        System.out.println("courses Taught");
        for (Course c:courseArrayList
             ) {
            c.showCourseDetails();
            System.out.println();
        }
        System.out.println();

    }

}

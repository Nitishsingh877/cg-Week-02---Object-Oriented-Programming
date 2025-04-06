package UniversityWithFaculitiesAndDepartments;

import java.util.ArrayList;

public class Department {
    private String departmentName;
    private ArrayList<Faculty> facultyArrayList;

    public Department(String departmentName) {
        this.departmentName =departmentName;
        facultyArrayList = new ArrayList<>();
    }
    public void getDeptNAme() {
        System.out.println("department name is "+  departmentName);
    }
    public void addFaculty(Faculty f) {
        facultyArrayList.add(f);
    }

    public void getDepartmentDetails(){
        System.out.println("department name is "+ departmentName);
        System.out.println("faculty name are");
        for (Faculty f:facultyArrayList
             ) {
            f.getFacultyDetails();
            System.out.println();
        }
        System.out.println();
    }



}

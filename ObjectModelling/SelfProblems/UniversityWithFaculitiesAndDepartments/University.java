package UniversityWithFaculitiesAndDepartments;

import java.util.ArrayList;

public class University {
    private String  univName;
    private ArrayList<Department> departmentArrayList;

    public University(String  univName) {
        this.univName =univName;
        departmentArrayList = new ArrayList<>();
    }

    public void addDepartment(Department dept) {
        departmentArrayList.add(dept);
    }
    public void getUnivName(){
        System.out.println("univ name is "+ univName);
    }

    public void getUnivDetails(){
        System.out.println("univ name is "+ univName);
        System.out.println("departments are : ");
        for (Department d:departmentArrayList
             ) {
          d.getDepartmentDetails();
        }
        System.out.println();
    }
}

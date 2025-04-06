package ComapnyAndDepartmnets;

import java.util.ArrayList;

public class Company {
    private String companyName;
    private int companyID;

    private ArrayList<Departments> departments;

    public Company(String companyName, int companyID) {
        this.companyName = companyName;
        this.companyID = companyID;
        departments = new ArrayList<>();
    }

    public void addDepartment(Departments d) {
        departments.add(d);
    }
    public void getCompanyDetails() {
        for (Departments d: departments) {
            d.getDepartment();
            d.getEmployees();
        }
    }

}

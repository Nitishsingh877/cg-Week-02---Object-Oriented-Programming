package UniversityWithFaculitiesAndDepartments;

public class Main {
    public static void main(String[] args) {
        University tit = new University("TIOT");

        //departments create
        Department ai = new Department("ai");
        Department java = new Department("java");
        Department c = new Department("c");

        //create faculty

        Faculty manoj = new Faculty("manoj",101);
        Faculty singh = new Faculty("singh",102);
        Faculty siddhu = new Faculty("siddhu",104);
        Faculty nitish = new Faculty("nitish", 105);

        //add faculty to departmment

        ai.addFaculty(manoj);
        ai.addFaculty(singh);
        ai.addFaculty(siddhu);
        java.addFaculty(nitish);
        c.addFaculty(siddhu);

        //add dept to univ
        tit.addDepartment(ai);
        tit.addDepartment(java);
        tit.addDepartment(c);

        //manoj.getFacultyDetails();
        //fetching dept details
        java.getDepartmentDetails();
        ai.getDepartmentDetails();
        c.getDepartmentDetails();


        //check university dept
        tit.getUnivDetails();
    }
}

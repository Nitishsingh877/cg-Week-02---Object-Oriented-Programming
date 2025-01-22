package UniversityWithFaculitiesAndDepartments;

public class Faculty {

    private String facultyName;
    private int facultyId;
    public Faculty(String facultyName, int facultyId) {
        this.facultyName = facultyName;
        this.facultyId = facultyId;
    }
      public void getFacultyDetails() {
          System.out.println("faculty name is "+ facultyName);
          System.out.println("faculty id is "+ facultyId);
      }
}

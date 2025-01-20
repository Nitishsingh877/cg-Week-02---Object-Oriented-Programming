public class OnlineCourseMgmt {
    public static void main(String[] args) {
//        calling class
        Course c1 = new Course("web dev", 1, 899);
        c1.displayDetails();
        Course.updateInstituteName("frz college");
        c1.displayDetails();
    }
}

class Course {
    //instance variables
   private String courseName;
    private  int duration;
    private  double fee;

    //class variable
    private static String instituteName = "tit college";

    //constructor
    Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }
     public static  void updateInstituteName(String updatedName) {
         instituteName = updatedName;
     }

     void  displayDetails() {
         System.out.println("the cousrse name is " + courseName);
         System.out.println("the duration is " + duration);
         System.out.println("the fee is $" + fee);
         System.out.println("the institute name is " + instituteName);

     }


}

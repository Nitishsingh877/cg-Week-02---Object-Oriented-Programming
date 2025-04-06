public class HospitalMgmtSystem {
    public static void main(String[] args) {
        Patient abc = new Patient("sauarabh","piles",22,101);
        Patient def = new Patient("shukla","headache",23,102);

        Patient.setHospitalName("Aiims bhopal");
        Patient.getTotalPatient();
        System.out.println("\n");
        abc.displayDetails();
        System.out.println("\n");
        def.displayDetails();

        if(abc instanceof Patient && def instanceof Patient){
            System.out.println("Yes dholu and bholu are patient");
        }

    }
}
class Patient {
    private static int totalPatient = 0;
    private static String hospitalName;
    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    //constructor
    public  Patient(String name,String ailment,int age,int patientID) {
        this.name = name;
        this.age =age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatient++;
    }

    public static void getTotalPatient() {
        System.out.println("total patient are "+ totalPatient);
    }
    public static void setHospitalName(String newHospitalName){
        hospitalName = newHospitalName;
    }

    public void displayDetails() {
        System.out.println("name is "+ name);
        System.out.println("age is "+ age);
        System.out.println("ailment is "+ ailment);
        System.out.println("hospital name is "+ hospitalName);
    }





}

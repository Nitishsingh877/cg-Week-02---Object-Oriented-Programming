package HospitalPatientManagement;

abstract class Patient {
    private int patientID;
    private String  name;
    private int age;
    private String diagnosis;

    public Patient(int patientID, String name, int age,String diagnosis) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.diagnosis =diagnosis;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    abstract double calculateBill();

    public void getPatientDetails(){
        System.out.println("name is " +getName());
        System.out.println("id is " + getPatientID());
        System.out.println("age is " + getAge());
    }

    protected String getDiagnosis(){
        return diagnosis;
    }
}

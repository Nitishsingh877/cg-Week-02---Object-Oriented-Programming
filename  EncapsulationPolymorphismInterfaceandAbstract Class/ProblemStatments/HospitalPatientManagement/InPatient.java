package HospitalPatientManagement;

public class InPatient extends Patient implements MedicalRecord{
    private int daysAdmitted;
    private double dailyRate;
    private StringBuilder medicalRecords;

    public InPatient(int patientID, String name, int age, String diagnosis, int daysAdmitted, double dailyRate) {
        super(patientID, name, age, diagnosis);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
        this.medicalRecords = new StringBuilder();
    }

    @Override
    double calculateBill() {
        return daysAdmitted*dailyRate;
    }

    @Override
    public void addRecord(String records) {
        medicalRecords.append(records).append("\n");
    }

    @Override
    public String viewRecord() {
        return medicalRecords.toString();
    }
}

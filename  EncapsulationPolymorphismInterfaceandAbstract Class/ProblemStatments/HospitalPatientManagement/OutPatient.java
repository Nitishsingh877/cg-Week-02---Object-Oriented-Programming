package HospitalPatientManagement;

public class OutPatient extends  Patient implements  MedicalRecord{
   private  int consultationFee;
   private StringBuilder medicalRecords;

   public OutPatient(int patientID, String name, int age, String diagnosis, int consultationFee) {
      super(patientID, name, age, diagnosis);
      this.consultationFee = consultationFee;
      this.medicalRecords = new StringBuilder();
   }

   @Override
   double calculateBill() {
      return consultationFee;
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

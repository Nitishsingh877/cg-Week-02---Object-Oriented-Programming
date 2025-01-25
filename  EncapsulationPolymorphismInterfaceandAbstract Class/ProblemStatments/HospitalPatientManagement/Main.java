package HospitalPatientManagement;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Patient> patientArrayList = new ArrayList<>();

        InPatient inPatient = new InPatient(101,"neha",22,"pnumonia",6,500);
        OutPatient outPatient = new OutPatient(102,"nunu",20,"fever",500);
        inPatient.addRecord("have big operations");
        inPatient.addRecord("minmum 5 week rest");
        outPatient.addRecord("fever symptoms");

        patientArrayList.add(inPatient);
        patientArrayList.add(outPatient);

        for (Patient p:patientArrayList
             ) {
            p.getPatientDetails();
            System.out.println("diagonisis is " + p.getDiagnosis());
            System.out.println("bill amount is " + p.calculateBill());
            System.out.println("medical records are " + ((MedicalRecord) p).viewRecord());
            System.out.println("---------------------");
        }
    }
}

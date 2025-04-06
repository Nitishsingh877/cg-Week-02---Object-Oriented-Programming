package HospitalDoctorAndPatient;

import java.util.ArrayList;

public class Doctor {
    private String doctorName;
    private ArrayList<Patient> patientArrayList;

    public Doctor(String doctorName){
        this.doctorName = doctorName;
        patientArrayList = new ArrayList<>();
    }
    public void getName(){
        System.out.println("doctor name is "+ doctorName);
    }
    public void addPatient(Patient patient){
       if (!patientArrayList.contains(patient)){
           patientArrayList.add(patient);
           patient.addDoctor(this); //establish bi-directional association
       }
    }
    public void Consult(Patient p){
        if(p == null){
            System.out.println("patient cant be null");
            return;
        }
        if(patientArrayList.contains(p)){
            System.out.println("Dr. " + doctorName + " is consulting " + p.getPatientName() );
        }else {
            System.out.println("Dr. "+ doctorName + " is not consulting " + p.getPatientName());
        }
    }

    public void getPatientDetails(){
        System.out.println("doctor name is "+ doctorName);
        for (Patient p:patientArrayList
             ) {
            p.getName();
        }
        System.out.println();

    }
}

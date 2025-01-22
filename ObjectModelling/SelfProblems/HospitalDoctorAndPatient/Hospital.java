package HospitalDoctorAndPatient;

import java.util.ArrayList;

public class Hospital {
    private String hospitalName;
    private ArrayList<Doctor> doctorArrayList;
    private ArrayList<Patient> patientArrayList;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctorArrayList =new ArrayList<>();
        patientArrayList = new ArrayList<>();
    }

    public void getName() {
        System.out.println("hospital name is "+ hospitalName);
    }
    public void addDoctor(Doctor doctor){
        doctorArrayList.add(doctor);
    }
    public void addPatient(Patient patient){
        patientArrayList.add(patient);
    }
}

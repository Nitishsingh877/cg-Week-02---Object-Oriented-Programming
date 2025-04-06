package HospitalDoctorAndPatient;

import javax.print.Doc;
import java.util.ArrayList;

public class Patient {
    private String patientName;
    private ArrayList<Doctor> doctorArrayList;

    public Patient(String patientName){
        this.patientName = patientName;
        doctorArrayList = new ArrayList<>();
    }

    public String getPatientName() {
        return patientName;
    }

    public void getName(){
        System.out.println("patient name is "+ getPatientName());
    }

    public void addDoctor(Doctor doctor){
        if(!doctorArrayList.contains(doctor)){
            doctorArrayList.add(doctor);
        }
    }

    public void getDoctorDetails(){
        System.out.println("patient name is "+ patientName);
        for (Doctor d:doctorArrayList
             ) {
            d.getName();
        }
    }
}

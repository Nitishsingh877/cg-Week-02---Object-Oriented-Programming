package HospitalDoctorAndPatient;

public class Main {
    public static void main(String[] args) {


        Hospital tit = new Hospital("Tiot hospital");

        //create doctor
        Doctor a = new Doctor("abc");
        Doctor b = new Doctor("def");
        Doctor c = new Doctor("efg");

        //create patient
        Patient p1 = new Patient("om");
        Patient p2 = new Patient("tiwari");
        Patient p3 = new Patient("singh");

        //add patient and doctor to hospital

        tit.addDoctor(a);
        tit.addDoctor(b);
        tit.addDoctor(c);
        tit.addPatient(p1);
        tit.addPatient(p2);
        tit.addPatient(p3);


        //establish association
        a.addPatient(p2);
        a.addPatient(p1);
        b.addPatient(p3);
        c.addPatient(p1);
//get details of doctors
        a.getPatientDetails();
        b.getPatientDetails();
        c.getPatientDetails();
//get patient details

        p1.getDoctorDetails();
        p2.getDoctorDetails();
        p3.getDoctorDetails();
        
        //consulations
        //valid
        a.Consult(p1);
        //invalid
        a.Consult(p3);
    }
}
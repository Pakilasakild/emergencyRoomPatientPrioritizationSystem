import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Patient> patients = patientRead.readFile("patients.txt");
            List<Doctor> doctors = doctorRead.readFile("doctors.txt");
            System.out.println("Patients:");
            for (int i = 0; i < patients.size(); i++) {
                System.out.println(patients.get(i).toString());
            }
            System.out.println("Doctors:");
            for (int i = 0; i < doctors.size(); i++) {
                System.out.println(doctors.get(i).toString());
            }

            summaryGen.summaryWrite("BasicRules", 28, 12.3, 37, 180);
            servedGen.servedWrite(patients.get(0).getPatientCode, doctors.get(0).getDoctorCode, 8, 12, 27);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
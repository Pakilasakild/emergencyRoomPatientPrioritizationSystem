import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Patient> patients = patientRead.readFile("patients.txt");
            List<Doctor> doctors = doctorRead.readFile("doctors.txt");
            System.out.println("Patients:");
            for (int i = 0; i < patients.size(); i++){
                System.out.println(patients.get(i).toString());
            }
            System.out.println("Doctors:");
            for (int i = 0; i < doctors.size(); i++){
                System.out.println(doctors.get(i).toString());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
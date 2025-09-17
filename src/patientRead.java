import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class patientRead {

    // Old method: only returns the last patient in the file
    public static Patient readLine(String file) {
        Patient patient = null;

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] patientInfo = line.split(";");
                patient = new Patient(
                        patientInfo[0],
                        patientInfo[1],
                        Integer.parseInt(patientInfo[2]),
                        Integer.parseInt(patientInfo[3]),
                        Integer.parseInt(patientInfo[4]),
                        Integer.parseInt(patientInfo[5]),
                        Float.parseFloat(patientInfo[6]),
                        Main.basicRules(
                                Integer.parseInt(patientInfo[5]),
                                Integer.parseInt(patientInfo[4]),
                                Double.parseDouble(patientInfo[6]),
                                Integer.parseInt(patientInfo[3]),
                                Integer.parseInt(patientInfo[2])
                        )
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return patient;
    }

    // New method: returns all patients in an ArrayList
    public static ArrayList<Patient> readAll(String file) {
        ArrayList<Patient> patients = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] patientInfo = line.split(";");
                Patient patient = new Patient(
                        patientInfo[0],
                        patientInfo[1],
                        Integer.parseInt(patientInfo[2]),
                        Integer.parseInt(patientInfo[3]),
                        Integer.parseInt(patientInfo[4]),
                        Integer.parseInt(patientInfo[5]),
                        Float.parseFloat(patientInfo[6]),
                        Main.basicRules(
                                Integer.parseInt(patientInfo[5]),
                                Integer.parseInt(patientInfo[4]),
                                Double.parseDouble(patientInfo[6]),
                                Integer.parseInt(patientInfo[3]),
                                Integer.parseInt(patientInfo[2])
                        )
                );
                patients.add(patient);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return patients;
    }
}

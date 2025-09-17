import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class patientRead {
    public static List<Patient> readFile(String file) {
        List<Patient> patients = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] patientInfo = line.split(";");
                patients.add(new Patient(patientInfo[0], patientInfo[1], Integer.parseInt(patientInfo[2]), Integer.parseInt(patientInfo[3]), Integer.parseInt(patientInfo[4]), Integer.parseInt(patientInfo[5]), Float.parseFloat(patientInfo[6])));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return patients;
    }
}

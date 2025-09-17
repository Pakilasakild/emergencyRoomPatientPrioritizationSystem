import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class doctorRead {
    public static ArrayList<Doctor> readFile(String file) {
        ArrayList<Doctor> doctors = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] doctorInfo = line.split(";");
                doctors.add(new Doctor(doctorInfo[0], doctorInfo[1], doctorInfo[2]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return doctors;
    }
}

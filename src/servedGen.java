import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class servedGen {
    public static void servedWrite(List<Served> served) {
        try {
            FileWriter writer = new FileWriter("served.txt");
            for (Served value : served) {
                writer.write(value.getPatientCode() + ";" + value.getDoctorCode() + ";" + value.getWaitingMinutes() + ";" + value.getStartMinute() + ";" + value.getEndMinute() + ";" + value.getStrat() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

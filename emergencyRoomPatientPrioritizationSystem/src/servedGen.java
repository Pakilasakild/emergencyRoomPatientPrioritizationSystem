import java.io.FileWriter;
import java.io.IOException;

public class servedGen {
    public static void servedWrite(String patientCode, String doctorCode, int waitingMinutes, int startMinute, int endMinute, String rules) {
        try{
            FileWriter writer = new FileWriter("served.txt");
            writer.write(patientCode + ";" + doctorCode + ";" + waitingMinutes + ";" + startMinute + ";" + endMinute + ";" + rules);
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

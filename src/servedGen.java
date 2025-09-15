import java.io.FileWriter;
import java.io.IOException;

public class servedGen {
    public static void servedWrite(String patientCode, String doctorCode, int urgency, int age, int timeWaited, String rules) {
        try{
            FileWriter writer = new FileWriter("served.txt");
            writer.write(patientCode + ";" + doctorCode + ";" + urgency + ";" + age + ";" + timeWaited + ";" + rules);
            writer.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}

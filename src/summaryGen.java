import java.io.FileWriter;
import java.io.IOException;

public class summaryGen {
    public static void summaryWrite(String rules, int aptarnauta, double avglauk, double maxlauk, int simtruk) {
        try {
            FileWriter writer = new FileWriter("summary.txt");
            writer.write("Strategija: " + rules + "\nAptarnauta: " + aptarnauta + "\nVid. laukimas (min): " + avglauk + "\nMaks. laukimas (min): " + maxlauk + "\nSimuliacijos trukmė (min): " + simtruk);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

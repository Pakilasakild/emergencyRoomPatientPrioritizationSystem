import java.time.LocalTime;
import java.util.*;

/*
ner skirtumo kurie rules, sortint score in arraylist \ queue
 */
public class Main {
    public static void main(String[] args) {
        try {
            ArrayList<Patient> patients = new ArrayList<>(patientRead.readAll("patients.txt"));
            for(int i = 0; i < patients.size() - 1; i++){
                for (int j = 0; j < patients.size() - i - 1; j++){
                    if (patients.get(j).getUrgency() > patients.get(j+1).getUrgency()){
                        Patient temp = patients.get(j);
                        patients.set(j, patients.get(j+1));
                        patients.set(j+1, temp);
                    }
                }
            }
            Queue<Patient> queue = new LinkedList<>(patients);
            ArrayList<Doctor> doctors = doctorRead.readFile("doctors.txt");
            List<Served> served = new ArrayList<>();
            for (Doctor doctor : doctors) {
                if (!Objects.equals(doctor.getDoctorWorkplace().toLowerCase(), "skubioji")) {
                    Patient temp = queue.remove();
                    Doctor tdoc = doctor;
                    served.add(new Served(temp.getPatientCode(), tdoc.getDoctorCode(), (LocalTime.now().getMinute()) - temp.getarrivalMinute(), temp.getarrivalMinute(), (LocalTime.now().getMinute()), "BasicRules"));
                }
            }
            servedGen.servedWrite(served);
            int maxw = -61, lauw = 0;
            for (Served value : served){
                lauw += value.getWaitingMinutes();
                if (value.getWaitingMinutes() > maxw){
                    maxw = value.getWaitingMinutes();
                }
            }
            int avgw = lauw / served.size();
            summaryGen.summaryWrite("BasicRules", served.size(), avgw, maxw, lauw);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static double basicRules(int spO2, int HR, double temp, int arrivalMinute, int age) {

        return 100 - spO2Penalty(spO2) - HRpenalty(HR) - tempPenalty(temp) - Math.min((LocalTime.now().getMinute() - arrivalMinute) / 5, 10) - (age > 75 ? 5 : 0);
    }

    public static double waitBoostRules(int spO2, int HR, double temp, int arrivalMinute, int age) {
        return 100 - spO2Penalty(spO2) - HRpenalty(HR) - tempPenalty(temp) - Math.min((LocalTime.now().getMinute() - arrivalMinute) * 0.8, 30) - (age > 75 ? 5 : 0);
    }

    private static int tempPenalty(double temp) {
        if (temp >= 40 || temp < 35) {
            return 15;
        } else if ((temp >= 30 && temp <= 39.9) || (temp >= 35 && temp <= 36)) {
            return 8;
        } else {
            return 0;
        }
    }

    private static int HRpenalty(int hr) {
        if (hr > 140 || hr < 40) {
            return 30;
        } else if ((hr >= 120 && hr <= 140) || (hr >= 40 && hr <= 50)) {
            return 15;
        } else {
            return 0;
        }
    }

    private static int spO2Penalty(int spO2) {
        if (spO2 < 85) {
            return 60;
        } else if (spO2 >= 85 && spO2 <= 89) {
            return 45;
        } else if (spO2 >= 90 && spO2 <= 92) {
            return 30;
        } else {
            return 0;
        }
    }
}
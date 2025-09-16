import java.time.LocalTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            List<Patient> patients = patientRead.readFile("patients.txt");
            List<Doctor> doctors = doctorRead.readFile("doctors.txt");
            summaryGen.summaryWrite("BasicRules", 28, 12.3, 37, 180);
            servedGen.servedWrite(patients.get(0).getPatientCode(), doctors.get(0).getDoctorCode(), 8, 12, 27, "BasicRules");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static double basicRules(int spO2, int HR, double temp, int arrivalMinute, int age) {
        return 100 - spO2Penalty(spO2) - HRpenalty(HR) - tempPenalty(temp) - Math.min((LocalTime.now().getMinute() - arrivalMinute) / 5, 10) - (age > 75 ? 5 : 0);
    }

    public static double waitBoostRules(int spO2, int HR, double temp, int arrivalMinute, int age) {
        return 100 - spO2Penalty(spO2) - HRpenalty(HR) - tempPenalty(temp) - Math.min((LocalTime.now().getMinute() - arrivalMinute) * 0.8, 10) - (age > 75 ? 5 : 0);
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
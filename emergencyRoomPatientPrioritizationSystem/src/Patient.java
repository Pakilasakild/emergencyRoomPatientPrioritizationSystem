public class Patient {
    private String patientCode;
    private String patientNameSurname;
    private int age;
    private int arrivalMinute;
    private int heartRate;
    private int spO2;
    private double temperature;

    public Patient(String patientCode, String patientNameSurname, int age, int arrivalMinute, int heartRate, int spO2, double temperature) {
        this.patientCode = patientCode;
        this.patientNameSurname = patientNameSurname;
        this.age = age;
        this.arrivalMinute = arrivalMinute;
        this.heartRate = heartRate;
        this.spO2 = spO2;
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientCode='" + patientCode + '\'' +
                ", patientNameSurname='" + patientNameSurname + '\'' +
                ", age=" + age +
                ", arrivalMinute=" + arrivalMinute +
                ", heartRate=" + heartRate +
                ", spO2=" + spO2 +
                ", temperature=" + temperature +
                '}';
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getPatientNameSurname() {
        return patientNameSurname;
    }

    public void setPatientNameSurname(String patientNameSurname) {
        this.patientNameSurname = patientNameSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getarrivalMinute() {
        return arrivalMinute;
    }

    public void setarrivalMinute(int arrivalMinute) {
        this.arrivalMinute = arrivalMinute;
    }

    public int getheartRate() {
        return heartRate;
    }

    public void setheartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public int getspO2() {
        return spO2;
    }

    public void setspO2(int spO2) {
        this.spO2 = spO2;
    }

    public double gettemperature() {
        return temperature;
    }

    public void settemperature(double temperature) {
        this.temperature = temperature;
    }
}

public class Served {
    private String patientCode;
    private String doctorCode;
    private int waitingMinutes;
    private int startMinute;
    private int endMinute;
    private String strat;

    @Override
    public String toString() {
        return "Served{" +
                "patientCode='" + patientCode + '\'' +
                ", doctorCode='" + doctorCode + '\'' +
                ", waitingMinutes=" + waitingMinutes +
                ", startMinute=" + startMinute +
                ", endMinute=" + endMinute +
                ", strat='" + strat + '\'' +
                '}';
    }

    public String getPatientCode() {
        return patientCode;
    }

    public void setPatientCode(String patientCode) {
        this.patientCode = patientCode;
    }

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public int getWaitingMinutes() {
        return waitingMinutes;
    }

    public void setWaitingMinutes(int waitingMinutes) {
        this.waitingMinutes = waitingMinutes;
    }

    public int getStartMinute() {
        return startMinute;
    }

    public void setStartMinute(int startMinute) {
        this.startMinute = startMinute;
    }

    public int getEndMinute() {
        return endMinute;
    }

    public void setEndMinute(int endMinute) {
        this.endMinute = endMinute;
    }

    public String getStrat() {
        return strat;
    }

    public void setStrat(String strat) {
        this.strat = strat;
    }

    public Served(String patientCode, String doctorCode, int waitingMinutes, int startMinute, int endMinute, String strat) {
        this.patientCode = patientCode;
        this.doctorCode = doctorCode;
        this.waitingMinutes = waitingMinutes;
        this.startMinute = startMinute;
        this.endMinute = endMinute;
        this.strat = strat;
    }
}

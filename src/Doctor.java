public class Doctor {
    private String doctorCode;
    private String doctorNameSurname;
    private String doctorWorkplace;

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorCode='" + doctorCode + '\'' +
                ", doctorNameSurname='" + doctorNameSurname + '\'' +
                ", doctorWorkplace='" + doctorWorkplace + '\'' +
                '}';
    }

    public Doctor(String doctorCode, String doctorNameSurname, String doctorWorkplace) {
        this.doctorCode = doctorCode;
        this.doctorNameSurname = doctorNameSurname;
        this.doctorWorkplace = doctorWorkplace;
    }
}

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

    public String getDoctorCode() {
        return doctorCode;
    }

    public void setDoctorCode(String doctorCode) {
        this.doctorCode = doctorCode;
    }

    public String getDoctorNameSurname() {
        return doctorNameSurname;
    }

    public void setDoctorNameSurname(String doctorNameSurname) {
        this.doctorNameSurname = doctorNameSurname;
    }

    public String getDoctorWorkplace() {
        return doctorWorkplace;
    }

    public void setDoctorWorkplace(String doctorWorkplace) {
        this.doctorWorkplace = doctorWorkplace;
    }
}

public class Patient {
    private String patientCode;
    private String patientNameSurname;
    private int age;
    private int urgency;
    private int height;
    private int weight;
    private double BMI;

    public Patient(String patientCode, String patientNameSurname, int age, int urgency, int height, int weight, double BMI) {
        this.patientCode = patientCode;
        this.patientNameSurname = patientNameSurname;
        this.age = age;
        this.urgency = urgency;
        this.height = height;
        this.weight = weight;
        this.BMI = BMI;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientCode='" + patientCode + '\'' +
                ", patientNameSurname='" + patientNameSurname + '\'' +
                ", age=" + age +
                ", urgency=" + urgency +
                ", height=" + height +
                ", weight=" + weight +
                ", BMI=" + BMI +
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

    public int getUrgency() {
        return urgency;
    }

    public void setUrgency(int urgency) {
        this.urgency = urgency;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getBMI() {
        return BMI;
    }

    public void setBMI(double BMI) {
        this.BMI = BMI;
    }
}

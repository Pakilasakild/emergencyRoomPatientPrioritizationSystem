public class Patient {
    private String patientCode;
    private String patientNameSurname;
    private int age;
    private int urgency;
    private int height;
    private int weight;
    private float BMI;

    public Patient(String patientCode, String patientNameSurname, int age, int urgency, int height, int weight, float BMI) {
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
}

package HospitalManagementSystem.com.example.hospital;

public class Doctor {

    private String name;

    private int doctorId;

    private String specialization;

    private int age;

    private String degree;

    public Doctor(String name, int doctorId, String specialization, int age, String degree) {
        this.name = name;
        this.doctorId = doctorId;
        this.specialization = specialization;
        this.age = age;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}

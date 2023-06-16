package HospitalManagementSystem.com.example.hospital;

public class Nurse {

    private String name;
    private int nurseId;
    private int age;
    private String qualification;

    public Nurse(String name, int nurseId, int age, String qualification) {
        this.name = name;
        this.nurseId = nurseId;
        this.age = age;
        this.qualification = qualification;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

}

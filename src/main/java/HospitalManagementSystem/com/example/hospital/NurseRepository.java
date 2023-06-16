package HospitalManagementSystem.com.example.hospital;

import HospitalManagementSystem.com.example.hospital.Nurse;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class NurseRepository {

    static HashMap<Integer, Nurse> nurseDb = new HashMap<>();

    public String addNurse(Nurse nurse){
        int key = nurse.getNurseId();
        nurseDb.put(key, nurse);
        return "added successfully";
    }
    public static Nurse getNurse(int nurseId){
        Nurse nurse = null;
        if(nurseDb.containsKey(nurseId)){
         nurse = nurseDb.get(nurseId);
        }
        return nurse;
    }

}


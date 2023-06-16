package HospitalManagementSystem.com.example.hospital;

import HospitalManagementSystem.com.example.hospital.Nurse;
import HospitalManagementSystem.com.example.hospital.NurseRepository;
import org.springframework.stereotype.Service;

@Service
public class NurseService {
    NurseRepository nurseRepository = new NurseRepository();

    public String addNurse(Nurse nurse){
        if(nurse.getNurseId() < 0) return "Enter a valid Id";

        if(nurse.getName() == null) return "Enter a name";

        String ans = nurseRepository.addNurse(nurse);
        return ans;
    }
    public static Nurse getNurse(int nurseId){
        Nurse nurse = NurseRepository.getNurse(nurseId);
        return nurse;
    }
}

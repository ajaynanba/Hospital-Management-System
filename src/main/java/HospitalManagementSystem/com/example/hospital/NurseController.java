package HospitalManagementSystem.com.example.hospital;

import HospitalManagementSystem.com.example.hospital.Nurse;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nurse")
public class NurseController {

    NurseService nurseService = new NurseService();

    @PostMapping("/add")
    public String add(@RequestBody Nurse nurse){
        String ans = nurseService.addNurse(nurse);
        return ans;
    }
    @GetMapping("/getNurse")
    public String getNurse(@RequestParam("nurseId") Integer nurseId){
        Nurse nurse = NurseService.getNurse(nurseId);
        return nurse.toString();
    }
}



package HospitalManagementSystem.com.example.hospital;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


@RestController
@RequestMapping("/Patient")
public class PatientController {

    HashMap<Integer, Patient> map = new HashMap<>();
    @PostMapping("/AddPatientViaParameters")
    public void AddPatientViaParameters(@RequestParam("patientName") String patientName,  @RequestParam("patientId") Integer patientId, @RequestParam("age") Integer age, @RequestParam("disease") String disease){
        Patient patient = new Patient(patientId, patientName, age, disease);
        int key = patient.getPatientId();
        map.put(key, patient);
    }

    @PostMapping("/addByRequestBody")
    public String addByRequestBody(@RequestBody Patient patient){
        int key = patient.getPatientId();
        map.put(key, patient);
        return "patient added through request body successfully";
    }

    @GetMapping("/getPatientInfo")
    public Patient getPatient(@RequestParam("getPatient") Integer patientId){
        return map.get(patientId);
    }

    @GetMapping("/getAllPatients")
    public List<Patient> getAllPatients(){
        List<Patient> patients = new ArrayList<>();
        for(Patient p : map.values()){
            patients.add(p);
        }
        return patients;
    }

    @GetMapping("/getPatientMoreThanAge")
    public List<Patient> getPatientMoreThanAge(@RequestParam("age") Integer age){
        List<Patient> patients = new ArrayList<>();
        for(Patient p : map.values()){
            if(p.getAge() > age){
                patients.add(p);
            }
        }
        return patients;
    }

    @GetMapping("/getPatientViaPathVariable/{patientAge}/{disease}")
    public List<Patient> getPatientViaPathVariable(@PathVariable("/patientAge") Integer patientAge, @PathVariable("/disease")String diease){
        List<Patient> patients = new ArrayList<>();
        for(Patient p : map.values()){
            if(p.getAge() == patientAge && p.getDisease() == diease) patients.add(p);
        }
        return patients;
    }

}

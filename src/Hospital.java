import java.util.*;

public class Hospital {
    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();
    public void addPatient(Patient p) {
        patients.add(p);
    }
    public void addDoctor(Doctor d) {
        doctors.add(d);
    }
    public Patient findPatientByPhone(String phone) {
        for (Patient p : patients) {
            if (p.getPhoneNumber().equals(phone)) {
                return p;
            }
        }
        return null;
    }
    public Patient findPatientByName(String name) {
        for (Patient p : patients) {
            if (p.getFullName().equals(name)) {
                return p;
            }
        }
        return null;
    }

    public void sortPatientsByName() {
        patients.sort(Comparator.comparing(Person::getFullName));
    }
    public List<Patient> getPatients() {
        return patients;
    }
    public List<Doctor> getDoctors() {
        return doctors;
    }
}

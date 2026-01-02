public class Doctor extends Person {
    private String speciality;

    public Doctor(String fullName, String phoneNumber, String speciality) {
        super(fullName, phoneNumber);
        this.speciality = speciality;
    }
    public String getSpeciality() {
        return speciality;
    }
    public String getRole() {
        return "Doctor";
    }
    public String toString() {
        return "Doctor{name='" + fullName + "', speciality='" + speciality + "'}";
    }
}

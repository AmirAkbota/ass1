public class Doctor {
    private String doctorName;
    private String doctorSpeciality;
    private String doctorHospital;
    private String doctorPhone;

    public Doctor(String doctorName, String doctorSpeciality, String doctorHospital,
                  String doctorPhone) {
        this.doctorName = doctorName;
        this.doctorSpeciality = doctorSpeciality;
        this.doctorHospital = doctorHospital;
        this.doctorPhone = doctorPhone;
    }

    public String getDoctorName() {
        return doctorName;
    }
     public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }
   public void setDoctorSpeciality(String doctorSpeciality){
        this.doctorSpeciality=doctorSpeciality;
    }
    public String getDoctorHospital() {
        return doctorHospital;
    }
   public void setDoctorHospital(String doctorHospital){
        this.doctorHospital=doctorHospital;
    }
    public String getDoctorPhone() {
        return doctorPhone;
    }
    public void setDoctorPhone(String doctorPhone){
        this.doctorPhone=doctorPhone;
    }
}


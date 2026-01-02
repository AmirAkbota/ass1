public class Patient extends Person{
    private  int age;

    public Patient(String fullName,String phoneNumber,int age){
        super(fullName,phoneNumber);
        this.age=age;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
public String getRole() {
    return "Patient";
}

public String toString() {
    return "Patient{name='" + fullName +
            "', phone='" + phoneNumber +
            "', age=" + age + "}";
}

public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Patient)) return false;
    Patient patient = (Patient) o;
    return phoneNumber.equals(patient.phoneNumber);
}

public int hashCode() {
    return phoneNumber.hashCode();
} }
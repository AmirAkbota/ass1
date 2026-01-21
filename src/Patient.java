public class Patient extends Person {

    private int age;

    public Patient(String fullName, String phoneNumber, int age) {
        super(fullName, phoneNumber);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String getRole() {
        return "Patient";
    }

    @Override
    public String toString() {
        return "Patient{name='" + fullName +
                "', phone='" + phoneNumber +
                "', age=" + age + "}";
    }
}
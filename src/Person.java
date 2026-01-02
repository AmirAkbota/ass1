public abstract class Person {
    protected String fullName;
    protected String phoneNumber;

    public Person(String fullName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
    }
    public String getFullName() { return fullName; }
    public String getPhoneNumber() { return phoneNumber; }

    public abstract String getRole();
}

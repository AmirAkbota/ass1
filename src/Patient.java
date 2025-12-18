public class Patient {
    private String fullName;
    private String phoneNumber;
    private  int age;

    public Patient(String fullName,String phoneNumber,int age){
        this.fullName=fullName;
        this.phoneNumber=phoneNumber;
        this.age=age;
    }
    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber= phoneNumber;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
 }

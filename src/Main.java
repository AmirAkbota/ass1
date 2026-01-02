import java.util.Scanner;
   public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        hospital.addPatient(new Patient("Amina", "+77085236981", 19));
        hospital.addPatient(new Patient("Dana", "+77084561278", 20));
        hospital.addPatient(new Patient("Altynai", "+77052369875", 23));
        hospital.addDoctor(new Doctor("Madina", "+77070000000", "Therapist"));
        hospital.addDoctor(new Doctor("Meruert","+77758453612","Cardiologist"));

        System.out.print("Enter phone to search patient: ");
        String phone = sc.nextLine();
        Patient p = hospital.findPatientByPhone(phone);
        System.out.println(p == null ? "Not found" : p);

        System.out.print("Enter name to search patient: ");
        String name = sc.nextLine();
        Patient byName = hospital.findPatientByName(name);
        System.out.println(byName == null ? "Not found" : byName);

        hospital.sortPatientsByName();
        System.out.println("After sorting:");
        for (Patient patient : hospital.getPatients()) {
            System.out.println(patient);
        }
        System.out.println("Add new doctor:");

        System.out.print("Enter doctor full name: ");
        String dName = sc.nextLine();

        System.out.print("Enter doctor phone number: ");
        String dPhone = sc.nextLine();

        System.out.print("Enter doctor speciality: ");
        String dSpec = sc.nextLine();

        hospital.addDoctor(new Doctor(dName, dPhone, dSpec));

     System.out.println("Doctors list:");
     for (Doctor d : hospital.getDoctors()) {
           System.out.println(d);
       }

   } }
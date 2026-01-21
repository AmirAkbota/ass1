import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if (DBConnection.getConnection() == null) {
            System.out.println("NOT CONNECTED");
            return;
        }
        System.out.println("CONNECTED TO DATABASE");

        Scanner sc = new Scanner(System.in);
        Hospital hospital = new Hospital();

        while (true) {
            System.out.println("\n===== HOSPITAL SYSTEM =====");
            System.out.println("1 - Add patient (INSERT)");
            System.out.println("2 - Show all patients (SELECT)");
            System.out.println("3 - Search patient (SELECT)");
            System.out.println("4 - Update patient age (UPDATE)");
            System.out.println("5 - Delete patient (DELETE)");
            System.out.println("6 - Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();


            switch (choice) {

                case 1:
                    System.out.print("Enter full name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter phone number: ");
                    String phone = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    PatientDB.addPatient(new Patient(name, phone, age));
                    break;

                case 2:
                    System.out.println("\nPatients list:");
                    for (Patient p : PatientDB.getAllPatients()) {
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.println("1 - Search by phone");
                    System.out.println("2 - Search by name");
                    System.out.print("Choose: ");
                    int searchType = sc.nextInt();
                    sc.nextLine();

                    if (searchType == 1) {
                        System.out.print("Enter phone: ");
                        String ph = sc.nextLine();
                        Patient p = PatientDB.findPatientByPhone(ph);
                        System.out.println(p == null ? "Not found" : p);
                    } else if (searchType == 2) {
                        System.out.print("Enter name: ");
                        String nm = sc.nextLine();
                        Patient p = PatientDB.findPatientByName(nm);
                        System.out.println(p == null ? "Not found" : p);
                    }
                    break;

                case 4:
                    System.out.print("Enter patient phone: ");
                    String updPhone = sc.nextLine();

                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();
                    sc.nextLine();

                    PatientDB.updatePatientAge(updPhone, newAge);
                    break;

                case 5:
                    System.out.print("Enter patient phone to delete: ");
                    String delPhone = sc.nextLine();

                    PatientDB.deletePatientByPhone(delPhone);
                    break;

                case 6:
                    System.out.println("Exit program");
                    sc.close();
                    return;

                default:
                    System.out.println("Wrong option");
            }
        }}}
public class Main {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("Madina", "Therapist","City Hospital","+77005632345");
        Doctor doctor2= new Doctor("Akerke","Therapist","National Hospital","+77084561234");
        Doctor doctor3=new Doctor("Aidana","Cardiologist","Village Hospital","+77787894561");

        Patient patient1=new Patient("Zhanar","+777084563296",54);
        Patient patient2=new Patient("Altynai","+77006598743",54);
        Patient patient3=new Patient("Zhayna","+77081235487",34);

        Hospital hospital1=new Hospital("City Hospital","Kyzylorda","+77084561239");
        Hospital hospital2=new Hospital("National Hospital","Karagandy","+77779638521");
        Hospital hospital3=new Hospital("Village Hospital","Taraz","+77784587423");


        System.out.println("Do they have the same profession? "+doctor1.getDoctorSpeciality().equals(doctor2.getDoctorSpeciality()));
        System.out.println("Do they have the same age? "+(patient1.getAge()==(patient2.getAge())));
    }
}
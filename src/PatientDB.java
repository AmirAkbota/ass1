import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PatientDB {

    public static void addPatient(Patient patient) {
        String sql = "INSERT INTO patients (full_name, phone_number, age) VALUES (?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, patient.getFullName());
            ps.setString(2, patient.getPhoneNumber());
            ps.setInt(3, patient.getAge());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Patient already exists: " + patient.getPhoneNumber());
        }
    }

    public static List<Patient> getAllPatients() {
        List<Patient> list = new ArrayList<>();
        String sql = "SELECT full_name, phone_number, age FROM patients";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Patient(
                        rs.getString("full_name"),
                        rs.getString("phone_number"),
                        rs.getInt("age")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void updatePatientAge(String phoneNumber, int newAge) {
        String sql = "UPDATE patients SET age = ? WHERE phone_number = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, newAge);
            ps.setString(2, phoneNumber);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Patient age updated");
            } else {
                System.out.println("Patient not found for update");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void deletePatientByPhone(String phoneNumber) {
        String sql = "DELETE FROM patients WHERE phone_number = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, phoneNumber);

            int rows = ps.executeUpdate();
            if (rows > 0) {
                System.out.println("Patient deleted");
            } else {
                System.out.println("Patient not found for deletion");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static Patient findPatientByPhone(String phone) {
        String sql = "SELECT full_name, phone_number, age FROM patients WHERE phone_number = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, phone);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Patient(
                        rs.getString("full_name"),
                        rs.getString("phone_number"),
                        rs.getInt("age")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static Patient findPatientByName(String name) {
        String sql = "SELECT full_name, phone_number, age FROM patients WHERE full_name = ?";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, name);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Patient(
                        rs.getString("full_name"),
                        rs.getString("phone_number"),
                        rs.getInt("age")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static List<Patient> getPatientsSortedByName() {
        List<Patient> list = new ArrayList<>();
        String sql = "SELECT full_name, phone_number, age FROM patients ORDER BY full_name";

        try (Connection con = DBConnection.getConnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                list.add(new Patient(
                        rs.getString("full_name"),
                        rs.getString("phone_number"),
                        rs.getInt("age")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

}


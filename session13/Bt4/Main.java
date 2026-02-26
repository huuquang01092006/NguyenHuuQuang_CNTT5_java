package session13.Bt4;

public class Main {
    public static void main(String[] args) {

        EmergencyRoom er = new EmergencyRoom();

        er.patientCheckIn("A");
        er.patientCheckIn("B");

        er.emergencyCheckIn("C");

        System.out.println("\n--- Bắt đầu điều trị ---");

        er.treatPatient();
        er.treatPatient();
        er.treatPatient();
    }
}
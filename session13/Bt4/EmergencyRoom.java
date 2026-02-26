package session13.Bt4;

import java.util.LinkedList;

public class EmergencyRoom {

    private LinkedList<String> queue;

    public EmergencyRoom() {
        queue = new LinkedList<>();
    }

    public void patientCheckIn(String name) {
        queue.addLast(name);
        System.out.println(name + " đã check-in (thường).");
    }

    public void emergencyCheckIn(String name) {
        queue.addFirst(name);
        System.out.println(name + " vào diện cấp cứu khẩn cấp!");
    }

    public void treatPatient() {
        if (queue.isEmpty()) {
            System.out.println("Không còn bệnh nhân nào.");
            return;
        }

        String patient = queue.removeFirst();

        System.out.println("Đang xử lý: " + patient);
    }
}
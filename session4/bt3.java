package session4;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class bt3 {
    public static void main(String[] args) {
        List<String> transactions = new ArrayList<>();
        transactions.add("MS001 - 2026-01-28");
        transactions.add("MS002 - 2026-01-28");
        transactions.add("MS003 - 2026-01-28");

        long start1 = System.nanoTime();
        String report1 = LocalDateTime.now() + "\n";
        for (String t : transactions) {
            report1 += t + "\n";
        }
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        sb.append(LocalDateTime.now()).append("\n");
        for (String t : transactions) {
            sb.append(t).append("\n");
        }
        String report2 = sb.toString();
        long end2 = System.nanoTime();

        System.out.println("Report with + :\n" + report1);
        System.out.println("Time with + : " + (end1 - start1) + " ns");
        System.out.println("Report with StringBuilder:\n" + report2);
        System.out.println("Time with StringBuilder: " + (end2 - start2) + " ns");
    }
}

package session4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.List;

public class bt5 {
    public static void main(String[] args) {
        List<String> logs = new ArrayList<>();
        logs.add("2024-05-20 | User: NguyenVanA | Action: BORROW | BookID: BK12345");
        logs.add("2024-05-20 | User: TranThiB | Action: RETURN | BookID: BK54321");
        logs.add("2024-05-21 | User: LeVanC | Action: BORROW | BookID: BK67890");

        String regex = "^(\\d{4}-\\d{2}-\\d{2}) \\| User: (\\w+) \\| Action: (BORROW|RETURN) \\| BookID: (\\w+)$";
        Pattern pattern = Pattern.compile(regex);

        int borrowCount = 0;
        int returnCount = 0;

        for (String log : logs) {
            Matcher matcher = pattern.matcher(log);
            if (matcher.matches()) {
                String date = matcher.group(1);
                String user = matcher.group(2);
                String action = matcher.group(3);
                String bookId = matcher.group(4);

                System.out.println("Date: " + date);
                System.out.println("User: " + user);
                System.out.println("Action: " + action);
                System.out.println("BookID: " + bookId);
                System.out.println("-------------------");

                if (action.equals("BORROW")) borrowCount++;
                if (action.equals("RETURN")) returnCount++;
            }
        }

        System.out.println("Tổng số BORROW: " + borrowCount);
        System.out.println("Tổng số RETURN: " + returnCount);
    }
}

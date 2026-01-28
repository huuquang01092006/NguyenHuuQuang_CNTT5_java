package session4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class bt4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String card = sc.nextLine();

        String regex = "^[A-Z]{2}(\\d{4})(\\d{5})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(card);

        if (matcher.matches()) {
            System.out.println("Mã thẻ hợp lệ: " + card);
        } else {
            if (!card.matches("^[A-Z]{2}.*")) {
                System.out.println("Thiếu tiền tố 2 chữ cái viết hoa");
            } else if (!card.matches("^[A-Z]{2}\\d{4}.*")) {
                System.out.println("Năm không hợp lệ");
            } else if (!card.matches("^[A-Z]{2}\\d{4}\\d{5}$")) {
                System.out.println("Chuỗi số cuối không hợp lệ");
            } else {
                System.out.println("Định dạng không hợp lệ");
            }
        }
    }
}

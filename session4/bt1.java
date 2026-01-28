package session4;

import java.util.Scanner;

public class bt1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookName = sc.nextLine().trim().replaceAll("\\s+", " ");
        String authorName = sc.nextLine().trim().replaceAll("\\s+", " ");
        String genre = sc.nextLine().trim().replaceAll("\\s+", " ");

        bookName = bookName.toUpperCase();

        String[] words = authorName.toLowerCase().split(" ");
        StringBuilder formattedAuthor = new StringBuilder();
        for (String w : words) {
            formattedAuthor.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1))
                    .append(" ");
        }
        authorName = formattedAuthor.toString().trim();

        System.out.println("[" + bookName + "] - Tác giả: " + authorName);
    }
}

package lmstask3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Күндү белгилеңиз (MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY):");
        String input = scanner.nextLine().toUpperCase();

        switch (input) {
            case "MONDAY" -> System.out.println("Дүйшөмбү күнү жава окуйм");
            case "TUESDAY" -> System.out.println("Шейшемби күнү англис тили сабагын окуйм");
            case "WEDNESDAY" -> System.out.println("Шаршемби күнү жава окуйм");
            case "THURSDAY" -> System.out.println(("Бейшемби күнү англис тили сабагын окуйм"));
            case "FRIDAY" -> System.out.println(("Жума күнү химия жава окуйм"));
            case "SATURDAY" -> System.out.println(("Ишемби күнү эс алам"));
            case "SUNDAY" -> System.out.println(("Жекшемби күнү эс алам"));
            default -> System.out.println("Мындай күн жок, туура киргизиңиз!");
        }

    }
}

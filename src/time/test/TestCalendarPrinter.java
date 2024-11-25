package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class TestCalendarPrinter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("년도를 입력하세요: ");

        int year = sc.nextInt();

        System.out.print("월을 입력하세요: ");

        int month = sc.nextInt();

        LocalDate target = LocalDate.of(year, month, 1);

        System.out.println("Su Mo Tu We Th Fr Sa ");

        int offsetWeekDays = target.getDayOfWeek().getValue() % 7;

        for (int i = 0; i < offsetWeekDays; i++) {
            System.out.print("   ");
        }

        LocalDate nextMonth = target.plusMonths(1);

        while (target.isBefore(nextMonth)) {
            System.out.printf("%2d ", target.getDayOfMonth());

            if (target.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }

            target = target.plusDays(1);
        }
    }
}

package time.test;

import java.time.LocalDateTime;

public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2024, 1, 1, 0, 0, 0);
        LocalDateTime changedDateTime = dateTime.plusYears(1L)
                .plusMonths(2)
                .plusDays(3)
                .plusHours(4);

        System.out.println("dateTime = " + dateTime);
        System.out.println("changedDateTime = " + changedDateTime);
    }
}

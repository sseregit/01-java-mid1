package time.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;
        // 코드 작성
        LocalDate date = LocalDate.of(year, month, 1);

        LocalDate first = date.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate last = date.with(TemporalAdjusters.lastDayOfMonth());


        System.out.println("first = " + first.getDayOfWeek());
        System.out.println("last = " + last.getDayOfWeek());

    }}

package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("nowDate = " + nowDate);
        System.out.println("ofDate = " + ofDate);

        ofDate = ofDate.plusDays(10);
        System.out.println("ofDate+10d = " + ofDate);
    }
}

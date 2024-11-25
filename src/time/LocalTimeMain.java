package time;

import java.time.LocalTime;

public class LocalTimeMain {

    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        LocalTime ofTime = LocalTime.of(9, 10, 30);

        System.out.println("nowTime = " + nowTime);
        System.out.println("ofTime = " + ofTime);

        ofTime = ofTime.plusSeconds(30);
        System.out.println("ofTime+30s = " + ofTime);
    }
}

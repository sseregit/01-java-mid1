package time;

import java.time.ZoneId;

public class ZoneIdMain {

    public static void main(String[] args) {
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println("zoneId = " + zoneId + " " + zoneId.getRules());

            System.out.println("ZoneId.systemDefault() = " + ZoneId.systemDefault());

            System.out.println("ZoneId.of(\"Asia/Seoul\") = " + ZoneId.of("Asia/Seoul"));
        }

    }
}

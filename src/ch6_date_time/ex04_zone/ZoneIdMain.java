package ch6_date_time.ex04_zone;

import java.time.ZoneId;

public class ZoneIdMain {
    public static void main(String[] args) {
        for(String availableZoneId : ZoneId.getAvailableZoneIds()){
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        System.out.println("=== ZoneId.systemDefault ===");
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault : " + zoneId);

        System.out.println("=== seoulZoneId ===");
        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);


    }
}

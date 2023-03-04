package time;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Date {

    public String date() {
        String time = ZonedDateTime.now(ZoneId.of("America/Bogota"))
                .format(DateTimeFormatter.ofPattern("MM.dd.yyy"));
        // .format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss a"));
        String date = time.replace("3","7");
        return date;
    }
}

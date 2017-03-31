package localDate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dwy on 2015/12/7.
 */
public class Days {

    public static List<DateSpan> splitsDate(String startDate, String endDate, int splits) {
        List<DateSpan> dateSpans = new ArrayList<>();
        LocalDate sdl = LocalDate.parse(startDate);
        LocalDate edl = LocalDate.parse(endDate);
        addDateSpan(sdl, edl, splits, dateSpans);
        return dateSpans;
    }

    private static void addDateSpan(LocalDate sdl, LocalDate edl, int splits, List<DateSpan> dateSpans) {
        LocalDate date = sdl.plusDays(splits - 1);
        if (edl.isBefore(date) || edl.equals(date)) {
            dateSpans.add(new DateSpan(sdl, edl));
        } else {
            dateSpans.add(new DateSpan(sdl, date));
            addDateSpan(date.plusDays(1), edl, splits, dateSpans);
        }
    }


    public static void main(String[] args) {
        LocalDate startDate = LocalDate.now();
        LocalDate endDate = LocalDate.parse("2015-11-01");
        System.out.println(startDate.until(endDate, ChronoUnit.DAYS));
        endDate = LocalDate.parse("2015-11-16");
        System.out.println(startDate.until(endDate, ChronoUnit.DAYS));
        endDate = LocalDate.parse("2015-11-30");
        System.out.println(startDate.until(endDate, ChronoUnit.DAYS));
        endDate = LocalDate.parse("2015-12-17");
        System.out.println(startDate.until(endDate, ChronoUnit.DAYS));
//        System.out.println(dateStringToLong("2286-11-21 04:00:00",Date_Time_Formatter_2));
//        System.out.println(dateLongToString(10000008000000L, Date_Time_Formatter_1));

//        splitsDate("2015-03-12", "2015-03-12", 10).stream().forEach(d ->
//                System.out.println(d.getStart() + "  " + d.getEnd())
//        );

//        System.out.println(ZonedDateTime.now());
//        ZonedDateTime zz = ZonedDateTime.parse("2016-03-18T16:24:12+08:00");
//        System.out.println(zz);
//        System.out.println(zz.toLocalDateTime());
//        System.out.println(LocalDate.parse("2016-03-18T16:24:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME));
//        LocalDate start = LocalDate.parse("2016-03-18T16:24:12", DateTimeFormatter.ISO_LOCAL_DATE_TIME);
//        LocalDate end = start.plusDays(365);
//        System.out.println(start + " " + end);

//
//        System.out.println(ZonedDateTime.now());
//        System.out.println(ZonedDateTime.now(ZoneOffset.UTC));

        System.out.println(LocalDate.now().getDayOfWeek());
        System.out.println(LocalDate.now().getDayOfWeek().getValue());
    }


}

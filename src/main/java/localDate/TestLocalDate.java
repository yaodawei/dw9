package localDate;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;
import java.util.Date;
import java.util.Timer;

/**
 * Created by dwy on 2015/10/26.
 */
public class TestLocalDate {

    public static void main(String[] args) {
        System.out.println("args = [" + LocalDate.now() + "]");
        System.out.println("args = [" + LocalDate.now().atStartOfDay() + "]");
        System.out.println("args = [" + LocalDateTime.now() + "]");
        System.out.println("args = [" + LocalDateTime.now().toLocalTime() + "]");
        System.out.println("args = [" + DateTimeFormatter.ofPattern("yyyy-mm-dd").parse("2015-10-26") + "]");
        LocalDate localDate = LocalDate.parse("2015-10-26", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("args = [" + localDate + "]");
        LocalDate localDate1 = LocalDate.parse("2015-09-27", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("args = [" + localDate.compareTo(localDate1) + "]");
        System.out.println("args = [" + localDate.isAfter(localDate1) + "]");
        System.out.println("args = [" + localDate.isBefore(localDate1) + "]");
        System.out.println("args = [" + localDate.isEqual(localDate1) + "]");
        System.out.println("args = [" + localDate.isLeapYear() + "]");

        System.out.println(System.currentTimeMillis());
        System.out.println(Instant.now());
        System.out.println(LocalDateTime.ofEpochSecond(Instant.now().getEpochSecond(),0, ZoneOffset.UTC));
        System.out.println(LocalDateTime.ofEpochSecond(Instant.now().getEpochSecond(),1, ZoneOffset.UTC));
        System.out.println(LocalDateTime.ofEpochSecond(Instant.now().getEpochSecond(),1000000, ZoneOffset.UTC));
        System.out.println(LocalDateTime.ofEpochSecond(Instant.now().getEpochSecond(),0, ZoneOffset.MIN));
        System.out.println(LocalDateTime.ofEpochSecond(Instant.now().getEpochSecond(),0, ZoneOffset.MAX));
        System.out.println(LocalDateTime.ofEpochSecond(System.currentTimeMillis(), 0, ZoneOffset.MAX));

        System.out.println(LocalDateTime.now().plusSeconds(20));

        System.out.println(Instant.ofEpochSecond(System.currentTimeMillis()));

        System.out.println(LocalDateTime.ofEpochSecond(Instant.ofEpochMilli(System.currentTimeMillis()).getEpochSecond(),0,ZoneOffset.UTC).toString());

        System.out.println(Clock.systemUTC());

        Instant.ofEpochMilli(System.currentTimeMillis());


        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().minusDays(1));
        System.out.println(LocalDateTime.now().plusDays(1));
        System.out.println(LocalDateTime.now().minusSeconds(20));
        System.out.println(LocalDateTime.now().plusSeconds(20));



        String updateTime = LocalDateTime.ofInstant(
                Instant.ofEpochMilli(10000008000000L),
                ZoneOffset.systemDefault()).format(DateTimeFormatter.ofPattern("uuuu-MM-dd'T'HH:mm:ss"));
        System.out.println(updateTime);
        DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");


        long epoch = LocalDateTime.parse("2286-11-21 04:00:00",  DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss")).atZone(ZoneId.systemDefault())
                .toInstant().toEpochMilli();
        System.out.println(epoch);
        LocalDateTime ll = LocalDateTime.now();
        ll.format(DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss"));


        long data1 = LocalDateTime.parse("2286-11-21").toEpochSecond(ZoneOffset.UTC);
    }

    public class testTemporalField implements TemporalField {

        @Override
        public TemporalUnit getBaseUnit() {
            return null;
        }

        @Override
        public TemporalUnit getRangeUnit() {
            return null;
        }

        @Override
        public ValueRange range() {
            return null;
        }

        @Override
        public boolean isDateBased() {
            return false;
        }

        @Override
        public boolean isTimeBased() {
            return false;
        }

        @Override
        public boolean isSupportedBy(TemporalAccessor temporal) {
            return false;
        }

        @Override
        public ValueRange rangeRefinedBy(TemporalAccessor temporal) {
            return null;
        }

        @Override
        public long getFrom(TemporalAccessor temporal) {
            return 0;
        }

        @Override
        public <R extends Temporal> R adjustInto(R temporal, long newValue) {
            return null;
        }
    }
}


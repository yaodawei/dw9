import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dwy on 2015/11/5.
 */
public class test {

    public static void main(String[] args) {
//        double sum=1;
//        double flg=1;
//        for(int i=1;i<1001;i++)
//        {
//            flg=flg*(-1);
//            double n = 1d/(2*i+1);
//            System.out.println(n);
//            sum+=flg*n;
//        }
//        System.out.println(sum*4);

        long data1 = LocalDateTime.parse("2017-02-20" + "T00:00:00").toEpochSecond(ZoneOffset.UTC)*1000;
        System.out.println(data1);

        long data2 = LocalDateTime.parse("2017-02-26" + "T23:59:59").toEpochSecond(ZoneOffset.UTC)*1000;
        System.out.println(data2);

        long epoch = LocalDate.parse("2017-02-20").atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();
        System.out.println(epoch);

        long epoch1 = LocalDate.parse("2017-02-26").atTime(LocalTime.parse("23:59:59")).atOffset(ZoneOffset.UTC).toInstant().toEpochMilli();
        System.out.println(epoch1);


        System.out.println(LocalDate.parse("2017-2-9",DateTimeFormatter.ISO_LOCAL_DATE));
    }

}

package org.example;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        format(now,DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        format(now,DateTimeFormatter.ISO_ZONED_DATE_TIME);

        final double numberToFormat = 123456.7;
        format(numberToFormat, new DecimalFormat("###,###.0"));
        format(numberToFormat, new DecimalFormat("###,###.00"));
        format(numberToFormat, new DecimalFormat("###,###.##"));
        format(numberToFormat, new DecimalFormat("###,000.##"));
        /*format(numberToFormat, new DecimalFormat("#,000,###,000.##"));
        format(numberToFormat, new DecimalFormat("000,###,000.##"));*/

        //Using dateTimeFormatter
        LocalDateTime dateTime=LocalDateTime.now();
        format(dateTime,DateTimeFormatter.ISO_DATE_TIME);
        format(dateTime,DateTimeFormatter.ofPattern("DD - MM- YYYY '--' hh:mm:ss"));
        format(dateTime,DateTimeFormatter.ofPattern("DD - mm- YYYY '--' hh:mm:ss"));
        format(dateTime,DateTimeFormatter.ofPattern("'new yearm'"));

    }

    public static void format(double number, NumberFormat format) {
        System.out.println(format.format(number));
    }

    public static void format(LocalDateTime dateTime, DateTimeFormatter formatter) {
        System.out.println(dateTime.format(formatter));
    }
    public static void format(ZonedDateTime dateTime, DateTimeFormatter formatter) {
        System.out.println(dateTime.format(formatter));
    }
}

package datetimeformatting;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
////        Calendar today = new Calendar();
//        Calendar today = Calendar.getInstance();
//        System.out.println(today.get(Calendar.YEAR)); // 2023
//        System.out.println(today.get(Calendar.MONTH)); // 7
//        System.out.println(today.get(Calendar.DATE)); // 26
//        System.out.println(today.get(Calendar.HOUR)); // 11
//        System.out.println(today.getActualMaximum(Calendar.DATE)); // 31
//        final int[] TIME_UNIT = {3600, 60, 1};
//        final String[] TIME_UNIT_NAME = {"시간 ", "분 ", "초 "};
//
//        Calendar time1 = Calendar.getInstance();
//        Calendar time2 = Calendar.getInstance();
//        // 시분초 임의 설정
//        time1.set(Calendar.HOUR_OF_DAY, 10);
//        time1.set(Calendar.MINUTE, 20);
//        time1.set(Calendar.SECOND, 30);
//
//        time2.set(Calendar.HOUR_OF_DAY, 20);
//        time2.set(Calendar.MINUTE, 30);
//        time2.set(Calendar.SECOND, 10);
//        // 두 시간의 차이 계산
//        long diff = Math.abs(time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000; // 초단위로 얻기 위해 '/1000'
//
//        String result = "";
//        for (int i = 0; i < TIME_UNIT.length; i++) {
//            result += diff/TIME_UNIT[i] + TIME_UNIT_NAME[i];
//            diff %= TIME_UNIT[i];
//        }
//        System.out.println(result); // 10시간 9분 40초

//        double number = 1234567.89;
//        DecimalFormat df = new DecimalFormat("\u00A4#,###"); //₩1,234,568
//        String result = df.format(number);
//        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd E요일 HH:mm:ss.SSS");
//
//        Date today = new Date();
//        String result = df.format(today); // 2023-08-27 일요일 01:16:49.110
//
//        Calendar cal = Calendar.getInstance();
//        cal.set(2005,9,3);
//        Date day = cal.getTime(); // Calendar -> Date
//        String result2 = df.format(day); // 2005-10-03 월요일 01:16:49.112
//
//        DateFormat df2 = new SimpleDateFormat("yyyy년 MM월 dd일");
//
//        try{ // 형식이 일치하지 않을 경우 예외가 발생하므로
//            Date d = df2.parse("2015년 11월 23일");
//
//            DateFormat df3 = new SimpleDateFormat("yyyy/MM/dd");
//            System.out.println(df3.format(d)); // // 2015/11/23
//        } catch (ParseException e) {}

//        LocalDate date = LocalDate.now();
//        LocalTime time = LocalTime.now();
//        LocalDateTime dateTime = LocalDateTime.now();
//        ZonedDateTime dateTimeInKr = ZonedDateTime.now();
//
//        System.out.println(date); // 2023-08-27
//        System.out.println(time); // 13:54:18.260464300
//        System.out.println(dateTime); // 2023-08-27T13:54:18.260464300
//        System.out.println(dateTimeInKr); // 2023-08-27T13:54:18.261464700+09:00[Asia/Seoul]
//        LocalDate date = LocalDate.of(2015,11,23); // 2015-11-23
//        LocalTime time = LocalTime.of(23,59,59); // 23:59:59
//        LocalDateTime dateTime = LocalDateTime.of(date, time); // 2015-11-23T23:59:59
//        ZonedDateTime zDateTime = ZonedDateTime.of(dateTime, ZoneId.of("Asia/Seoul")); // 2015-11-23T23:59:59+09:00[Asia/Seoul]

//        LocalTime time = LocalTime.now(); // 14:01:28.303999200
//        int minute = time.getMinute(); // 1
//
//        LocalDate date = LocalDate.now(); // 2023-08-27
//        LocalDate tomorrow = date.plusDays(1); // 2023-08-28
//        LocalDate date3 = LocalDate.of(2023,3,1);
//        date3 = date3.minusDays(1); // 2023-02-28
//        System.out.println(date3);
//        LocalDate date1 = LocalDate.of(1999,12,31);
//        LocalDate date2 = LocalDate.of(2000,1,1);
//        System.out.println(date1.isBefore(date2)); // true
//        System.out.println(date1.compareTo(date2)); // -1
//        LocalDate date = LocalDate.of(2015, 12, 31);
//        LocalTime time = LocalTime.of(23, 34, 56);
//
//        LocalDateTime dt = LocalDateTime.of(date, time);
//        LocalDateTime dt2 = date.atTime(time);
//        LocalDateTime dt3 = time.atDate(date);
//        LocalDateTime dt4 = date.atTime(23, 34, 56);
//        LocalDateTime dt5 = time.atDate(LocalDate.of(2015, 12, 31));
//        LocalDateTime dt = LocalDateTime.of(2015, 12, 31, 12, 34, 56); // 2015-12-31T12:34:56
//        LocalDate date = dt.toLocalDate(); // 2015-12-31
//        LocalTime time = dt.toLocalTime(); // 12:34:56
//        LocalDateTime dateTime = LocalDateTime.now();
//        ZoneId zid = ZoneId.of("Asia/Seoul");
//        ZonedDateTime zdt = dateTime.atZone(zid);
//        System.out.println(zdt); // 2023-08-27T14:37:57.919939800+09:00[Asia/Seoul]

//        ZonedDateTime zdt = ZonedDateTime.now(); // 2023-08-27T14:41:24.170526200+09:00[Asia/Seoul]
//
//        LocalDate ld = zdt.toLocalDate(); // 2023-08-27
//        LocalTime lt = zdt.toLocalTime(); // 14:41:24.170526200
//        LocalDateTime ldt = zdt.toLocalDateTime(); // 2023-08-27T14:41:24.170526200
//        System.out.println(zdt);
//        System.out.println(ld);
//        System.out.println(lt);
//        System.out.println(ldt);

//        LocalDate date1 = LocalDate.of(2014,1,1);
//        LocalDate date2 = LocalDate.of(2015,2,1);
//        Period pe = Period.between(date1, date2); // P1Y1M
//        Period pe2 = Period.between(date2, date1); // P-1Y-1M
//        long period = date2.toEpochDay() - date1.toEpochDay(); // 396
//
//        LocalTime time1 = LocalTime.of(00,00,00);
//        LocalTime time2 = LocalTime.of(12,34,56);
//        Duration du = Duration.between(time1, time2); // PT12H34M56S
//        Duration du2 = Duration.between(time2, time1); // PT-12H-34M-56S
//        long duration = time2.toSecondOfDay() - time1.toSecondOfDay(); // 45296

//        LocalDate date = LocalDate.of(2016,11,1);
//
//        String sample = DateTimeFormatter.ISO_LOCAL_DATE.format(date); // 2016-11-01
//        String sample2 = date.format(DateTimeFormatter.ISO_LOCAL_DATE); // 2016-11-01

//        DateTimeFormatter dateformatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
//        DateTimeFormatter timeformatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
//
//        DateTimeFormatter dateformatter2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
//        DateTimeFormatter timeformatter2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
//
//        DateTimeFormatter dateformatter3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
//        DateTimeFormatter timeformatter3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
//
//        DateTimeFormatter dateformatter4 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
//        DateTimeFormatter timeformatter4 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
//
//        String dateresult = dateformatter.format(LocalDate.now()); // 23. 8. 27.
//        String timeresult = timeformatter.format(LocalTime.now()); // 오후 3:25
//        String dateresult2 = dateformatter2.format(LocalDate.now()); // 2023. 8. 27.
//        String timeresult2 = timeformatter2.format(LocalTime.now()); // 오후 3:25:54
//        String dateresult3 = dateformatter3.format(LocalDate.now()); // 2023년 8월 27일
////        String timeresult3 = timeformatter3.format(LocalTime.now());
//        String dateresult4 = dateformatter4.format(LocalDate.now()); // 2023년 8월 27일 일요일
////        String timeresult4 = timeformatter4.format(LocalTime.now());

//        System.out.println(dateresult); // 23. 8. 27.
//        System.out.println(timeresult); // 오후 3:25
//        System.out.println(dateresult2); // 2023. 8. 27.
//        System.out.println(timeresult2); // 오후 3:25:54
//        System.out.println(dateresult3); // 2023년 8월 27일
////        System.out.println(timeresult3);
//        System.out.println(dateresult4); // 2023년 8월 27일 일요일
////        System.out.println(timeresult4);

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//
//        ZonedDateTime zdt = ZonedDateTime.now();
//        System.out.println(zdt.format(formatter)); // 2023/08/27
    }
}


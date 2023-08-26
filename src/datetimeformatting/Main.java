package datetimeformatting;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd E요일 HH:mm:ss.SSS");

        Date today = new Date();
        String result = df.format(today); // 2023-08-27 일요일 01:16:49.110

        Calendar cal = Calendar.getInstance();
        cal.set(2005,9,3);
        Date day = cal.getTime(); // Calendar -> Date
        String result2 = df.format(day); // 2005-10-03 월요일 01:16:49.112

        DateFormat df2 = new SimpleDateFormat("yyyy년 MM월 dd일");

        try{ // 형식이 일치하지 않을 경우 예외가 발생하므로
            Date d = df2.parse("2015년 11월 23일");

            DateFormat df3 = new SimpleDateFormat("yyyy/MM/dd");
            System.out.println(df3.format(d)); // // 2015/11/23
        } catch (ParseException e) {}
    }
}


package test;

import java.time.*;

/**
 * @author: codeJerry
 * @description:
 * localDateTime具有不可变性 修改后需要一个变量保存返回值
 * 线程安全
 * @date: 2020/04/07 15:26
 */
public class localDateTimeTest {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        System.out.println(localDateTime);
        System.out.println(localDate);
        System.out.println(localTime);

        System.out.println("*******************");
        LocalDateTime localDateTime1 = localDateTime.withMonth(3);
        System.out.println(localDateTime);
        System.out.println(localDateTime1);


        System.out.println("****************");
        Instant instant = Instant.now();
        //伦敦时间
        System.out.println(instant);
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

    }
}

package test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author: codeJerry
 * @description: 时间
 * 要用localDateTime 线程安全
 * @date: 2020/04/07 14:31
 */
public class DateTimeTest {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = new Date();
        //格式化
        System.out.println(sdf.format(date));
        //解析
        Date date1 = sdf.parse("2020-04-07 02:33:19");
        System.out.println(date1);


    }
}

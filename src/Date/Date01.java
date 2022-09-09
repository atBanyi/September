package Date;

import java.util.Date;

public class Date01 {
    public static void main(String[] args) {
        Date d = new Date();
//        1970 1.1. 00:00:00到现在的毫秒
        System.out.println(d.getTime());
//        当前日期
        System.out.println(d);
    }
}

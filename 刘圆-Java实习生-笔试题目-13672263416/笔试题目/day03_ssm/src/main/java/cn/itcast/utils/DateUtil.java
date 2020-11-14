package cn.itcast.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");
//    private static SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

    public static Date string2Date(String dateString)
    {
        Date date=null;
        try {
            date=sdf.parse(dateString);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date;
    }

}
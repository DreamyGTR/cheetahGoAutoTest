package util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * DateUtil类主要用于生成年、月、日、小时、分钟和秒等信息,用于生成截图文件目录名和文件名
 */
public class DateUtil {
    /**
     * 格式化输出日期
     *
     * @param date
     * @param format
     * @return 返回字符型日期
     */
    public static String forMat(Date date, String format) {
        String result = "";
        try {
            if (date != null) {
                DateFormat df = new SimpleDateFormat(format);
                result = df.format(date);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 返回年份
     *
     * @param date
     * @return
     */
    public static int getYear(Date date) {
        java.util.Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.YEAR);
    }

    /**
     * 返回月份
     *
     * @param date
     * @return
     */
    public static int getMonth(Date date) {
        java.util.Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MONTH) + 1;
    }

    /**
     * 返回月份中的第几天
     *
     * @param date
     * @return
     */
    public static int getDay(Date date) {
        java.util.Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    /**
     * 返回小时
     *
     * @param date
     * @return
     */
    public static int getHour(Date date) {
        java.util.Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.HOUR_OF_DAY);
    }

    /**
     * 返回分钟
     *
     * @param date
     * @return
     */
    public static int getMinute(Date date) {
        java.util.Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MINUTE);
    }

    /**
     * 返回秒
     *
     * @param date
     * @return
     */
    public static int getSecond(Date date) {
        java.util.Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.SECOND);
    }

}

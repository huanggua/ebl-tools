package com.wangyin.ebl.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    public enum DateField{
        Year, Month, Day;
    }


    public final static int YEAR = 1;
    public final static int MONTH = 2;
    public final static int DATE = 3;
    /**
     *
     * @Description: 在date基础上，增加或减少年、月、日
     * @Title: add
     * @author:yangyang
     * @date:2012-2-21
     * @param date
     *            基础日期
     * @param field
     *            Util.YEAR=年，Util.MONTH=月，Util.DATE=日
     * @param amount
     *            正负数
     * @return Date
     * @throws
     */
    public static Date add(Date date, int field, int amount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        if (field == DateUtil.YEAR) {
            calendar.add(Calendar.YEAR, amount);
            return calendar.getTime();
        } else if (field == DateUtil.MONTH) {
            calendar.add(Calendar.MONTH, amount);
            return calendar.getTime();
        } else if (field == DateUtil.DATE) {
            calendar.add(Calendar.DATE, amount);
            return calendar.getTime();
        }
        return null;
    }

    /**
     * 获取日
     * @Description: TODO
     * @Title: getDate
     * @author:yangyang
     * @date:2012-4-11
     * @param date
     * @return
     * int
     * @throws
     */
    public static int getDate(Date date){
        int day = -1;
        SimpleDateFormat format = new SimpleDateFormat("dd");
        String str = format.format(date);
        day = Integer.parseInt(str);
        return day;
    }

    /**
     * 将HH:mm:ss转化为Date
     * @param str HH:mm:ss
     * @return Date HH:mm:ss
     */
    public static Date strHmsToDate(String str){
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 将String yyyy-MM-dd HH:mm:ss转化为Date
     * @param str yyyy-MM-dd HH:mm:ss
     * @return Date yyyy-MM-dd HH:mm:ss
     */
    public static Date strYMdHmsToDate(String str){
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date;
    }
    /**
     * 将Date型的HH:mm:ss转化为HH:mm:ss
     * @param date HH:mm:ss
     * @return String  HH:mm:ss
     */
    public static String dateHmsToStr(Date date){
        String str = null;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        str = format.format(date);
        return str;
    }
    /**
     * 将Date yyyy-MM-dd HH:mm:ss转化为String
     * @param date yyyy-MM-dd HH:mm:ss
     * @return str yyyy-MM-dd HH:mm:ss
     */
    public static String dateYMdHmsToString(Date date){
        String str = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        str = format.format(date);
        return str;
    }
    /**
     * 将String 型的yyyy-MM-dd转化为Date  yyyy-MM-dd
     * @param str yyyy-MM-dd
     * @return Date yyyy-MM-dd
     */
    public static Date strYMdToDate(String str){
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 将String 型的yyyy/MM/dd转化为Date  yyyy/MM/dd
     * @param str yyyy/MM/dd
     * @return Date yyyy/MM/dd
     */
    public static Date strYMdToDate1(String str){
        Date date = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return date;
    }

    /**
     * 将Date yyyy-MM-dd 转化为String yyyy-MM-dd
     * @param date yyyy-MM-dd
     * @return String yyyy-MM-dd
     */
    public static String dateYMdToStr(Date date){
        String str = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        str = format.format(date);
        return str;
    }

    /**
     * 将Date yyyy-MM-dd 转化为String yyyy-MM-dd 23:59:59
     * @param date yyyy-MM-dd
     * @return String yyyy-MM-dd
     */
    public static String dateYMdToStrEndOfDay(Date date){
        String str = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        str = format.format(date) + " 23:59:59";
        return str;
    }

    /**
     * 将Date yyyy-MM-dd 转化为String yyyy-MM-dd 00:00:00
     * @param date yyyy-MM-dd
     * @return String yyyy-MM-dd
     */
    public static String dateYMdToStrBeginOfDay(Date date){
        String str = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        str = format.format(date) + " 00:00:00";
        return str;
    }

    /**
     * 将Date yyyy-MM-dd 转化为String yyyy-MM-dd 00:00:01
     * @param date yyyy-MM-dd
     * @return String yyyy-MM-dd
     */
    public static String dateYMdToStrFirstSec(Date date){
        String str = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        str = format.format(date) + " 00:00:01";
        return str;
    }

    /**
     * 将Date 转化为String yyyyMMdd
     * @param date yyyy-MM-dd
     * @return String yyyy-MM-dd
     */
    public static String dateYMdToStrNoSplit(Date date){
        String str = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        str = format.format(date);
        return str;
    }

    /**
     * 将Date转化为年月 yyyyMM
     * @Description: TODO
     * @Title: dateToMonth
     * @author:yangyang
     * @date:2012-4-9
     * @param date
     * @return
     * String
     * @throws
     */
    public static String dateYMdToMonth(Date date){
        String str  = null;
        SimpleDateFormat format = new SimpleDateFormat("yyyyMM");
        str = format.format(date);
        return str;
    }

    /**
     *
     * 功能描述：获取当前日期，返回strFormat格式字符串
     *
     * @param strFormat
     * @return
     *
     * @author yangyang
     * @version 1.0.0, 2012-8-30
     */
    public static String getCurrentDateString(String strFormat , int dayDelta){
        Date calendar = add(Calendar.getInstance().getTime(), DATE, dayDelta);
        SimpleDateFormat format = new SimpleDateFormat(strFormat);
        return format.format(calendar);
    }

    /**
     *
     * 功能描述：获取当前日期，返回yyyyMM格式字符串
     *
     * @return
     *
     * @author yangyang
     * @version 1.0.0, 2012-7-17
     */
    public static String getCurrentYearMonthString(){
        Calendar calendar = Calendar.getInstance();
        return dateYMdToMonth(calendar.getTime());
    }

    /**
     *
     * 功能描述：获取前一天的日期，格式为yyyyMMdd或者yyyy-MM-dd
     *
     * @param noSpliter - true, 返回yyyyMMdd格式；false,返回yyyy-MM-dd格式
     * @return
     *
     * @author yangyang
     * @version 1.0.0, 2012-7-18
     */
    public static String getYestodayDateString(boolean noSpliter){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);

        if(noSpliter){
            return dateYMdToStrNoSplit(calendar.getTime());
        }

        return dateYMdToStr(calendar.getTime());
    }


    public static String getYestodayDateString(boolean noSpliter,int day){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, day);

        if(noSpliter){
            return dateYMdToStrNoSplit(calendar.getTime());
        }

        return dateYMdToStr(calendar.getTime());
    }


    /**
     *
     * 功能描述：获取前一天的yyyyMM格式日期
     *
     * @return
     *
     * @author yangyang
     * @version 1.0.0, 2012-7-18
     */
    public static String getYestodayYearMonthString(){
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DATE, -1);

        return dateYMdToMonth(calendar.getTime());
    }

    /**
     *
     * 功能描述：获取当前日期的年份
     *
     * @return
     *
     * @author yangyang
     * @version 1.0.0, 2012-8-30
     */
    public static String getCurrentYear(){
        Calendar calendar = Calendar.getInstance();
        return String.valueOf(calendar.get(Calendar.YEAR));
    }

    /**
     *
     * 功能描述：获取当前日期的月份
     *
     * @return
     *
     * @author yangyang
     * @version 1.0.0, 2012-8-30
     */
    public static String getCurrentMonth(){
        Calendar calendar = Calendar.getInstance();
        return String.valueOf(calendar.get(Calendar.MONTH)+1);
    }

    /**
     *
     * 功能描述：：获取当前日期的天数
     *
     * @return
     *
     * @author yangyang
     * @version 1.0.0, 2012-8-30
     */
    public static String getCurrentDay(){
        Calendar calendar = Calendar.getInstance();
        return String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
    }


    /**
     *
     * 功能描述：获取年、月、日日期字段的值
     *
     * @param field
     * @param strDate
     * @return
     *
     * @author yangyang
     * @version 1.0.0, 2012-8-30
     */
    public static String getSpecifiedField(DateField field, String strDate){
        if(strDate == null || strDate.length() == 0){
            strDate = getCurrentDateString("yyyy-MM-dd",0);
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(strYMdToDate(strDate));
        String value = "";
        switch(field){
            case Year:
                value = String.valueOf(calendar.get(Calendar.YEAR));
                break;
            case Month:
                value = String.valueOf(calendar.get(Calendar.MONTH) + 1);
                break;
            case Day:
                value = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
                break;
            default:
                value = String.valueOf(calendar.get(Calendar.DAY_OF_MONTH));
                break;
        }

        return value;
    }

    /**
     *
     * 功能描述：根据日期，返回日期计算后的field数值
     *
     * @param field - DateField
     * @param strDate - 指定的日期值，默认为当前日期
     * @param diff
     * @return
     *
     * @author yangyang
     * @version 1.0.0, 2012-8-30
     */
    public static String getSpecifiedField(DateField field, String strDate, int diff){
        if(strDate == null || strDate.length() == 0){
            strDate = getCurrentDateString("yyyy-MM-dd",0);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(strYMdToDate(strDate));

        calendar.add(Calendar.DATE, diff);
        strDate = dateYMdToStr(calendar.getTime());

        return getSpecifiedField(field, strDate);
    }

    public static void main(String[] args) {
        System.out.println(getSpecifiedField(DateField.Month, "2012-01-01", -1));
        System.out.println(getSpecifiedField(DateField.Day, "2012-01-01", -1));
    }
    public synchronized static String getTimeSnapshot(){
        String  timeSnapshot;
        timeSnapshot = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return timeSnapshot;
    }

    /**
     * 时间转换成毫秒
     * @param time
     * @return
     * @throws ParseException
     */
    public String time2MillionSeconds(Object time) throws ParseException{
        Date date = (Date)time;
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return String.valueOf(c.getTimeInMillis());
    }
}

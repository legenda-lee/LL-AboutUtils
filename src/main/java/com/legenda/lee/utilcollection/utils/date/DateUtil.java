package com.legenda.lee.utilcollection.utils.date;

import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;



/**
 * @author Legenda-Lee
 * @date 2019-11-19 21:00:37
 * @description 时间处理工具类
 */
@Slf4j
public class DateUtil {

    /**
     * 日期格式1
     */
    public static final String DATE_PATTERN_ONE = "yyyyMMdd";

    /**
     * 日期格式2
     */
    public static final String DATE_PATTERN_TWO = "yyyy-MM-dd";


    /**
     * 时间格式1
     */
    public static final String DATE_TIME_PATTERN_ONE = "yyyy-MM-dd HH:mm:ss";

    /**
     * 时间格式2
     */
    public static final String DATE_TIME_PATTERN_TWO = "yyyy-MM-dd hh:mm:ss";

    /**
     * 时间格式3
     */
    public static final String DATE_TIME_PATTERN_THREE = "yyyyMMddHHmmss";

    /**
     * 时间格式4
     */
    public static final String DATE_TIME_PATTERN_FOUR = "yyyyMMddHHmmssSSS";



    /**
     * @author Legenda-Lee
     * @date 2019-11-20 11:25:49
     * @description 获取指定日期时间格式的通用方法
     *
     * @param pattern 日期时间格式
     * @return Sting 日期时间
     */
    public static String get(String pattern) {
        DateTime dateTime = new DateTime(System.currentTimeMillis());
        return dateTime.toString(pattern);
    }

    /**
     * @author Legenda-Lee
     * @date 2019-11-20 11:26:51
     * @description 获取yyyyMMdd格式的日期
     *
     * @return Sting 日期时间
     */
    public static String getNowDate1() {
        return get(DATE_PATTERN_ONE);
    }

    /**
     * @author Legenda-Lee
     * @date 2019-11-20 11:26:51
     * @description 获取yyyy-MM-dd格式的日期
     *
     * @return Sting 日期时间
     */
    public static String getNowDate2() {
        return get(DATE_PATTERN_TWO);
    }

    /**
     * @author Legenda-Lee
     * @date 2019-11-20 11:26:51
     * @description 获取yyyy-MM-dd HH:mm:ss格式的日期
     *
     * @return Sting 日期时间
     */
    public static String getNowDateTime1() {
        return get(DATE_TIME_PATTERN_ONE);
    }

    /**
     * @author Legenda-Lee
     * @date 2019-11-20 11:26:51
     * @description 获取yyyy-MM-dd hh:mm:ss格式的日期
     *
     * @return Sting 日期时间
     */
    public static String getNowDateTime2() {
        return get(DATE_TIME_PATTERN_TWO);
    }

    /**
     * @author Legenda-Lee
     * @date 2019-11-20 11:26:51
     * @description 获取yyyyMMddHHmmss格式的日期
     *
     * @return Sting 日期时间
     */
    public static String getNowDateTime3() {
        return get(DATE_TIME_PATTERN_THREE);
    }

    /**
     * @author Legenda-Lee
     * @date 2019-11-20 11:26:51
     * @description 获取yyyyMMddHHmmssSSS格式的日期
     *
     * @return Sting 日期时间
     */
    public static String getNowDateTime4() {
        return get(DATE_TIME_PATTERN_FOUR);
    }



    /**
     * @author Legenda-Lee
     * @date 2019-11-19 20:58:02
     * @description 测试
     */
    public static void main(String[] args) {
        System.out.println(getNowDate1());
        System.out.println(getNowDate2());
        System.out.println(getNowDateTime1());
        System.out.println(getNowDateTime2());
        System.out.println(getNowDateTime3());
        System.out.println(getNowDateTime4());
    }
}

/*******************************************************************************
 * Project Key : CPPII Create on 2016年11月23日 上午11:59:13 Copyright (c) 2008 - 2011.深圳市齐采科技有限公司版权所有.
 * 粤ICP备16034195号 注意：本内容仅限于深圳市齐采科技服务有限公司内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/

package com.qc.springboot.core.date;


import java.time.format.DateTimeFormatter;

/**
 * <P>日期格式化类，提供常用的日期格式化对象</P>
 *
 * @author 王好（18675539583） 2018-02-01 17:03
 * @version 1.0
 */
public class DatePattern {

    //-------------------------------------------------------------------------------------------------------------------------------- Normal
    /** 标准日期格式：yyyy-MM-dd */
    public final static String NORM_DATE_PATTERN = "yyyy-MM-dd";
    /** 标准日期格式 {@link DateTimeFormatter}：yyyy-MM-dd */
    public final static DateTimeFormatter NORM_DATE_FORMAT = DateTimeFormatter.ofPattern(NORM_DATE_PATTERN);

    /** 标准时间格式：HH:mm:ss */
    public final static String NORM_TIME_PATTERN = "HH:mm:ss";
    /** 标准时间格式 {@link DateTimeFormatter}：HH:mm:ss */
    public final static DateTimeFormatter NORM_TIME_FORMAT = DateTimeFormatter.ofPattern(NORM_TIME_PATTERN);

    /** 标准日期时间格式，精确到分：yyyy-MM-dd HH:mm */
    public final static String NORM_DATETIME_MINUTE_PATTERN = "yyyy-MM-dd HH:mm";
    /** 标准日期时间格式，精确到分 {@link DateTimeFormatter}：yyyy-MM-dd HH:mm */
    public final static DateTimeFormatter NORM_DATETIME_MINUTE_FORMAT = DateTimeFormatter.ofPattern(NORM_DATETIME_MINUTE_PATTERN);

    /** 标准日期时间格式，精确到秒：yyyy-MM-dd HH:mm:ss */
    public final static String NORM_DATETIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
    /** 标准日期时间格式，精确到秒 {@link DateTimeFormatter}：yyyy-MM-dd HH:mm:ss */
    public final static DateTimeFormatter NORM_DATETIME_FORMAT = DateTimeFormatter.ofPattern(NORM_DATETIME_PATTERN);

    /** 标准日期时间格式，精确到毫秒：yyyy-MM-dd HH:mm:ss.SSS */
    public final static String NORM_DATETIME_MS_PATTERN = "yyyy-MM-dd HH:mm:ss.SSS";
    /** 标准日期时间格式，精确到毫秒 {@link DateTimeFormatter}：yyyy-MM-dd HH:mm:ss.SSS */
    public final static DateTimeFormatter NORM_DATETIME_MS_FORMAT = DateTimeFormatter.ofPattern(NORM_DATETIME_MS_PATTERN);

    //-------------------------------------------------------------------------------------------------------------------------------- Pure
    /** 标准日期格式：yyyyMMdd */
    public final static String PURE_DATE_PATTERN = "yyyyMMdd";
    /** 标准日期格式 {@link DateTimeFormatter}：yyyyMMdd */
    public final static DateTimeFormatter PURE_DATE_FORMAT = DateTimeFormatter.ofPattern(PURE_DATE_PATTERN);

    /** 标准日期格式：HHmmss */
    public final static String PURE_TIME_PATTERN = "HHmmss";
    /** 标准日期格式 {@link DateTimeFormatter}：HHmmss */
    public final static DateTimeFormatter PURE_TIME_FORMAT = DateTimeFormatter.ofPattern(PURE_TIME_PATTERN);

    /** 标准日期格式：yyyyMMddHHmmss */
    public final static String PURE_DATETIME_PATTERN = "yyyyMMddHHmmss";
    /** 标准日期格式 {@link DateTimeFormatter}：yyyyMMddHHmmss */
    public final static DateTimeFormatter PURE_DATETIME_FORMAT = DateTimeFormatter.ofPattern(PURE_DATETIME_PATTERN);

    /** 标准日期格式：yyyyMMddHHmmssSSS */
    public final static String PURE_DATETIME_MS_PATTERN = "yyyyMMddHHmmssSSS";
    /** 标准日期格式 {@link DateTimeFormatter}：yyyyMMddHHmmssSSS */
    public final static DateTimeFormatter PURE_DATETIME_MS_FORMAT = DateTimeFormatter.ofPattern(PURE_DATETIME_MS_PATTERN);

    //-------------------------------------------------------------------------------------------------------------------------------- Others
    /** HTTP头中日期时间格式：EEE, dd MMM yyyy HH:mm:ss z */
    public final static String HTTP_DATETIME_PATTERN = "EEE, dd MMM yyyy HH:mm:ss z";
    /** HTTP头中日期时间格式 {@link DateTimeFormatter}：EEE, dd MMM yyyy HH:mm:ss z */
    public final static DateTimeFormatter HTTP_DATETIME_FORMAT = DateTimeFormatter.ofPattern(HTTP_DATETIME_PATTERN);

    /** HTTP头中日期时间格式：EEE MMM dd HH:mm:ss zzz yyyy */
    public final static String JDK_DATETIME_PATTERN = "EEE MMM dd HH:mm:ss zzz yyyy";
    /** HTTP头中日期时间格式 {@link DateTimeFormatter}：EEE MMM dd HH:mm:ss zzz yyyy */
    public final static DateTimeFormatter JDK_DATETIME_FORMAT = DateTimeFormatter.ofPattern(JDK_DATETIME_PATTERN);
}

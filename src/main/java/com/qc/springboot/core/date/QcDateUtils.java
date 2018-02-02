/*******************************************************************************
 * Project Key : CPPII Create on 2016年11月23日 上午11:59:13
 * Copyright (c) 2008 - 2011.深圳市齐采科技有限公司版权所有.
 * 粤ICP备16034195号
 * 注意：本内容仅限于深圳市齐采科技服务有限公司内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/

package com.qc.springboot.core.date;

import com.qc.springboot.core.utils.QcStringUtils;
import lombok.experimental.UtilityClass;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 * <P>日期工具类</P>
 *
 * @author 王好（18675539583） 2018-02-01 15:55
 * @version 1.0
 */
@UtilityClass
public class QcDateUtils {

    /**
     * <P>获取当前时间字符串,格式为:yyyy-MM-dd HH:mm:ss</P>
     *
     * @return
     * @version 1.0
     * @author 王好（18675539583）
     */
    public static String now() {
        return LocalDateTime.now().format(DatePattern.NORM_DATETIME_FORMAT);
    }

    /**
     * <P>获取当前日期字符串,格式为:yyyy-MM-dd</P>
     *
     * @return
     * @version 1.0
     * @author 王好（18675539583）
     */
    public static String today() {
        return LocalDate.now().toString();
    }

    // ------------------------------------ Format start ----------------------------------------------

    /**
     * 根据特定格式格式化日期
     *
     * @param date    被格式化的日期
     * @param pattern 日期格式，常用格式见： {@link DatePattern}
     * @return 格式化后的字符串
     */
    public static String format(final Date date, final String pattern) {
        if (null == date || QcStringUtils.isBlank(pattern)) {
            return null;
        }
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern(pattern));
    }


    /**
     * 日期格式化为yyyy-MM-dd字符串
     *
     * @param date 被格式化的日期
     * @return 格式化后的字符串
     */
    public static String formatToDate(final Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).format(DatePattern.NORM_DATETIME_FORMAT);
    }

    /**
     * 日期格式化为yyyy-MM-dd HH:mm:ss字符串
     *
     * @param date 被格式化的日期
     * @return 格式化后的字符串
     */
    public static String formatToDateTime(final Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault()).format(DatePattern.NORM_DATE_FORMAT);
    }

    /**
     * <p>日期解析</p>
     *
     * @param dateString 日期字符串
     * @param pattern    格式化格式
     * @return
     * @author 王好（18675539583）  2017年11月2日 下午3:29:12
     */
    public static Date parseDateTime(final String dateString, final String pattern) {
        if (QcStringUtils.isBlank(dateString) || QcStringUtils.isBlank(pattern)) {
            return null;
        }

        TemporalAccessor ta = DateTimeFormatter.ofPattern(pattern).parse(dateString);
        //根据是否有时间字段判断是否是时间类型
        boolean isTime = ta.isSupported(ChronoField.HOUR_OF_DAY);
        Instant instant;
        if (isTime) {
            instant = LocalDateTime.from(ta).atZone(ZoneId.systemDefault()).toInstant();
        } else {
            instant = LocalDate.from(ta).atStartOfDay(ZoneId.systemDefault()).toInstant();
        }
        return Date.from(Instant.from(instant));
    }

    /**
     * <p>日期解析，默认格式为yyyy-MM-dd</p>
     *
     * @param dateString
     * @return
     * @author 王好（18675539583）  2017年11月2日 下午3:29:12
     */
    public static Date parseDateTime(final String dateString) {
        return parseDateTime(dateString, DatePattern.NORM_DATE_PATTERN);
    }


    // ------------------------------------ Format end ----------------------------------------------

}

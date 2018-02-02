package com.qc.springboot.core.date;

import org.junit.Test;

import java.time.LocalDate;
import java.util.Date;

/**
 * <P>TODO</P>
 *
 * @author 王好（18675539583） 2018-02-01 17:24
 * @version 1.0
 */
public class QcDateUtilsTest {

    @Test
    public void now() {
        String now = QcDateUtils.now();
        System.out.println(now);
    }

    @Test
    public void today() {
        //String today = QcDateUtils.today();
        String today = LocalDate.now().toString();
        System.out.println(today);
    }

    @Test
    public void format() {
        String fmtDate = QcDateUtils.format(new Date(), DatePattern.PURE_DATETIME_MS_PATTERN);
        System.out.println(fmtDate);
    }

    @Test
    public void parseDateTime(){
        Date fmtDate = QcDateUtils.parseDateTime("2018-01-01 01:11:11",DatePattern.NORM_TIME_PATTERN);
        System.out.println(QcDateUtils.formatToDateTime(fmtDate));
    }
}
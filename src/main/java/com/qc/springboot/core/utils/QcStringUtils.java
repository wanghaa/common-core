/*******************************************************************************
 * Project Key : CPPII Create on 2016年11月23日 上午11:59:13 Copyright (c) 2008 - 2011.深圳市齐采科技有限公司版权所有.
 * 粤ICP备16034195号 注意：本内容仅限于深圳市齐采科技服务有限公司内部传阅，禁止外泄以及用于其他的商业目的
 ******************************************************************************/

package com.qc.springboot.core.utils;

import lombok.experimental.UtilityClass;

/**
 * <P>字符串工具类</P>
 *
 * @author 王好（18675539583） 2018-02-01 17:15
 * @version 1.0
 */
@UtilityClass
public class QcStringUtils {

    public static boolean isBlank(final CharSequence cs) {
        int strLen;
        if (cs == null || (strLen = cs.length()) == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (Character.isWhitespace(cs.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }
    public static boolean isNotBlank(final CharSequence cs) {
        return !isBlank(cs);
    }
}

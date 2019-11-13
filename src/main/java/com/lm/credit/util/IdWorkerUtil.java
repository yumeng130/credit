package com.lm.credit.util;

import com.baomidou.mybatisplus.toolkit.IdWorker;

/**
 * @author SY
 * @since 2018-01-11
 */

public class IdWorkerUtil {


    /**
     * 19位数字字符
     *
     * @return
     */
    public static String getNextId() {
        return String.valueOf(IdWorker.getId());
    }

    /**
     * 19位数字
     *
     * @return
     */
    public static Long getId() {
        return IdWorker.getId();
    }

}

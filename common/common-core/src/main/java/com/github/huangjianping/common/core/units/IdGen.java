package com.github.huangjianping.common.core.units;

import java.util.UUID;

/**
 * @auther huang jianping
 * @date 2019/4/16 10:58
 */
public class IdGen {
    /**
     * 封装JDK自带的UUID, 中间无-分割.
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

}

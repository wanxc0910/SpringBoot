package com.example.demo.utils;

import java.util.UUID;

/**
 * @author ：wanxc
 * @date ：Created in 2021/3/10 21:25
 * @description：
 */
public class idUtil {
    public static String getId() {
        UUID uuid = UUID.randomUUID();
        String uuidStr = uuid.toString();
        return uuidStr.replace("-", "");
    }
}

package com.chris.example.util;

import java.util.Random;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/13 21:16
 */
public class ServerPortUtil {
    public static int getAvailablePort() {
        int max = 9000;
        int min = 2000;
        Random random = new Random();
        int port = ((random.nextInt(max)) % (max - min + 1)) + min;
        boolean using = NetUtil.isLocalePortUsing(port);
        if (using) {
            return getAvailablePort();
        } else {
            return port;
        }
    }
}

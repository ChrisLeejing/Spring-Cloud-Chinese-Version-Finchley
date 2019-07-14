package com.chris.example.util;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * This is description.
 *
 * @author Chris Lee
 * @date 2019/7/13 21:22
 */
public class NetUtil {
    /***
     *  true:already in using  false:not using
     * @param port
     */
    public static boolean isLocalePortUsing(int port) {
        boolean flag = true;
        try {
            flag = isPortUsing("127.0.0.1", port);
        } catch (Exception e) {
        }
        return flag;
    }

    /***
     *  true:already in using  false:not using
     * @param host
     * @param port
     * @throws UnknownHostException
     */
    public static boolean isPortUsing(String host, int port) {
        boolean flag = false;
        try {
            InetAddress theAddress = InetAddress.getByName(host);
            Socket socket = new Socket(theAddress, port);
            socket.close();
            flag = true;
        } catch (Exception e) {

        }
        return flag;
    }

}

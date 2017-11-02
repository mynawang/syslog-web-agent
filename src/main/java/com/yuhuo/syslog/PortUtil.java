package com.yuhuo.syslog;

import java.util.Random;

/**
 * Created by mynawang on 2017/10/31 0031.
 */
public class PortUtil {

    public static String getPort() {
        int max=2147483647;
        int min=0;
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        return s+ "";
    }

    public static String getTimeMin() {
        int max=10000;
        int min=0;
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        return s+ "";
    }

    public static String getRanNum() {
        int max=255;
        int min=1;
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        return s+ "";
    }


    public static void main(String[] args) {
        System.out.println(getPort());
    }
}

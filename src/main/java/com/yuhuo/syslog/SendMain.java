package com.yuhuo.syslog;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mynawang on 2017/10/31 0031.
 */
public class SendMain {

    public static void main(String[] args) {

        String sysIp1 = "192.168.31.201";
        String sysIp2 = "192.168.31.202";
        String sysIp3 = "192.168.31.203";

        List<String> arrIps = new ArrayList<String>();
        arrIps.add(sysIp1);
        arrIps.add(sysIp2);
        arrIps.add(sysIp3);

        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < arrIps.size(); j++) {
                SysLogSendMainAll sysLogSendMainAll = new SysLogSendMainAll(arrIps.get(j));
                sysLogSendMainAll.start();
                System.out.println(i);
            }


            /*SysLogSend sysLogSend = new SysLogSend();
            sysLogSend.start();

            SysLogSend2 sysLogSend2 = new SysLogSend2();
            sysLogSend2.start();

            SysLogSendMain3 sysLogSendMain3 = new SysLogSendMain3();
            sysLogSendMain3.start();*/


        }

    }

    public static class SysLogSendMainAll extends Thread {
        String ip;

        public SysLogSendMainAll(String ip) {
            this.ip = ip;
        }

        @Override
        public void run() {
            SyslogSendAll syslogSendAll = new SyslogSendAll(ip);
        }
    }
}

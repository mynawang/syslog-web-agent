package com.yuhuo;

import com.yuhuo.syslog.SyslogSendAll;
import com.yuhuo.syslog.SyslogSendSign;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @auther mynawang
 * @create 2017-07-10 17:13
 */
@RestController
public class SyslogController {

    @RequestMapping("/send")
    @ResponseBody
    public String sendMsg(String ip) {
        SyslogSendSign.SEND_SIGN.put(ip, 1);
        for (int i = 0; i < 100; i++) {
            SysLogSendMainAll sysLogSendMainAll = new SysLogSendMainAll(ip);
            sysLogSendMainAll.start();
            System.out.println(i);
        }
        return "syslog send success";
    }

    @RequestMapping("/stop")
    @ResponseBody
    public String stopMsg(String ip) {
        SyslogSendSign.SEND_SIGN.put(ip, 0);
        return "syslog stop success";
    }


    public class SysLogSendMainAll extends Thread {
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

package com.yuhuo;

import com.yuhuo.insert.InsertService;
import com.yuhuo.insert.InsertSign;
import com.yuhuo.syslog.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by mynawang on 2017/11/3 0003.
 */
@RestController
public class InsertController {

    @Autowired
    private InsertService insertService;

    @RequestMapping("/insert")
    @ResponseBody
    public String sendMsg(String ip) {
        InsertSign.INSERT_SIGN.put("insert", 1);
        InsertAll1 insertAll1 = new InsertAll1(insertService);
        insertAll1.start();

        InsertAll2 insertAll2 = new InsertAll2(insertService);
        insertAll2.start();

        InsertAll3 insertAll3 = new InsertAll3(insertService);
        insertAll3.start();


        InsertAll4 insertAll4 = new InsertAll4(insertService);
        insertAll4.start();

        InsertAll5 insertAll5 = new InsertAll5(insertService);
        insertAll5.start();

        InsertAll6 insertAll6 = new InsertAll6(insertService);
        insertAll6.start();

        InsertAll7 insertAll7 = new InsertAll7(insertService);
        insertAll7.start();

        InsertAll8 insertAll8 = new InsertAll8(insertService);
        insertAll8.start();

        InsertAll9 insertAll9 = new InsertAll9(insertService);
        insertAll9.start();

        InsertAll10 insertAll10 = new InsertAll10(insertService);
        insertAll10.start();

        InsertAll11 insertAll11 = new InsertAll11(insertService);
        insertAll11.start();

        InsertAll12 insertAll12 = new InsertAll12(insertService);
        insertAll12.start();

        return "dbrecord insert start success";
    }


    @RequestMapping("/cancel")
    @ResponseBody
    public String stopInsert() {
        InsertSign.INSERT_SIGN.put("insert", 0);
        return "dbrecord insert stop success";
    }


    public static class InsertAll12 extends Thread {

        InsertService insertService;

        public InsertAll12(InsertService insertService) {
            this.insertService = insertService;
        }

        @Override
        public void run() {
            Integer sign = InsertSign.INSERT_SIGN.get("insert");
            while (sign == 1) {
                List<Map<Integer, Object>> params1 = new ArrayList<Map<Integer, Object>>();
                for (int i = 0; i < 1000; i++) {
                    Map<Integer, Object> map1 = new HashMap<Integer, Object>();
                    map1.put(1, new Double(1));
                    map1.put(2, new Long(TimeUtil.getTimeSimple2()));
                    map1.put(3, 1);
                    map1.put(4, PortUtil.getPort());
                    params1.add(map1);
                }
                insertService.insertTable12(params1);
                sign = InsertSign.INSERT_SIGN.get("insert");
            }
        }
    }


    public static class InsertAll11 extends Thread {

        InsertService insertService;

        public InsertAll11(InsertService insertService) {
            this.insertService = insertService;
        }

        @Override
        public void run() {
            Integer sign = InsertSign.INSERT_SIGN.get("insert");
            while (sign == 1) {
                List<Map<Integer, Object>> params1 = new ArrayList<Map<Integer, Object>>();
                for (int i = 0; i < 1000; i++) {
                    Map<Integer, Object> map1 = new HashMap<Integer, Object>();
                    map1.put(1, new Double(1));
                    map1.put(2, new Long(TimeUtil.getTimeSimple2()));
                    map1.put(3, 1);
                    map1.put(4, PortUtil.getPort());
                    params1.add(map1);
                }
                insertService.insertTable11(params1);
                sign = InsertSign.INSERT_SIGN.get("insert");
            }
        }
    }


    public static class InsertAll10 extends Thread {
        InsertService insertService;
        public InsertAll10(InsertService insertService) {
            this.insertService = insertService;
        }
        @Override
        public void run() {
            Integer sign = InsertSign.INSERT_SIGN.get("insert");
            while (sign == 1) {
                List<Map<Integer, Object>> params2 = new ArrayList<Map<Integer, Object>>();
                for (int i = 0; i < 1000; i++) {
                    Map<Integer, Object> map2 = new HashMap<Integer, Object>();
                    map2.put(1, new Double(1));
                    map2.put(2, new Double(1));
                    map2.put(3, new Double(1));
                    map2.put(4, new Double(1));
                    map2.put(5, new Double(1));
                    map2.put(6, new Double(1));
                    map2.put(7, new Long(TimeUtil.getTimeSimple2()));
                    map2.put(8, 1);
                    map2.put(9, TimeUtil.getTimeAll());
                    params2.add(map2);
                }
                insertService.insertTable10(params2);
                sign = InsertSign.INSERT_SIGN.get("insert");
            }
        }
    }


    public static class InsertAll9 extends Thread {

        InsertService insertService;

        public InsertAll9(InsertService insertService) {
            this.insertService = insertService;
        }

        @Override
        public void run() {
            Integer sign = InsertSign.INSERT_SIGN.get("insert");
            while (sign == 1) {
                List<Map<Integer, Object>> params1 = new ArrayList<Map<Integer, Object>>();
                for (int i = 0; i < 1000; i++) {
                    Map<Integer, Object> map1 = new HashMap<Integer, Object>();
                    map1.put(1, new Double(1));
                    map1.put(2, new Long(TimeUtil.getTimeSimple2()));
                    map1.put(3, 1);
                    map1.put(4, PortUtil.getPort());
                    params1.add(map1);
                }
                insertService.insertTable9(params1);
                sign = InsertSign.INSERT_SIGN.get("insert");
            }
        }
    }

    public static class InsertAll8 extends Thread {

        InsertService insertService;

        public InsertAll8(InsertService insertService) {
            this.insertService = insertService;
        }

        @Override
        public void run() {
            Integer sign = InsertSign.INSERT_SIGN.get("insert");
            while (sign == 1) {
                List<Map<Integer, Object>> params1 = new ArrayList<Map<Integer, Object>>();
                for (int i = 0; i < 1000; i++) {
                    Map<Integer, Object> map1 = new HashMap<Integer, Object>();
                    map1.put(1, new Double(1));
                    map1.put(2, new Long(TimeUtil.getTimeSimple2()));
                    map1.put(3, 1);
                    map1.put(4, PortUtil.getPort());
                    params1.add(map1);
                }
                insertService.insertTable8(params1);
                sign = InsertSign.INSERT_SIGN.get("insert");
            }
        }
    }

    public static class InsertAll7 extends Thread {

        InsertService insertService;

        public InsertAll7(InsertService insertService) {
            this.insertService = insertService;
        }

        @Override
        public void run() {
            Integer sign = InsertSign.INSERT_SIGN.get("insert");
            while (sign == 1) {
                List<Map<Integer, Object>> params1 = new ArrayList<Map<Integer, Object>>();
                for (int i = 0; i < 1000; i++) {
                    Map<Integer, Object> map1 = new HashMap<Integer, Object>();
                    map1.put(1, new Double(1));
                    map1.put(2, new Long(TimeUtil.getTimeSimple2()));
                    map1.put(3, 1);
                    map1.put(4, PortUtil.getPort());
                    params1.add(map1);
                }
                insertService.insertTable7(params1);
                sign = InsertSign.INSERT_SIGN.get("insert");
            }
        }
    }


    public static class InsertAll6 extends Thread {

        InsertService insertService;

        public InsertAll6(InsertService insertService) {
            this.insertService = insertService;
        }

        @Override
        public void run() {
            Integer sign = InsertSign.INSERT_SIGN.get("insert");
            while (sign == 1) {
                List<Map<Integer, Object>> params1 = new ArrayList<Map<Integer, Object>>();
                for (int i = 0; i < 1000; i++) {
                    Map<Integer, Object> map1 = new HashMap<Integer, Object>();
                    map1.put(1, new Double(1));
                    map1.put(2, new Long(TimeUtil.getTimeSimple2()));
                    map1.put(3, 1);
                    map1.put(4, PortUtil.getPort());
                    params1.add(map1);
                }
                insertService.insertTable6(params1);
                sign = InsertSign.INSERT_SIGN.get("insert");
            }
        }
    }


    public static class InsertAll5 extends Thread {

        InsertService insertService;

        public InsertAll5(InsertService insertService) {
            this.insertService = insertService;
        }

        @Override
        public void run() {
            Integer sign = InsertSign.INSERT_SIGN.get("insert");
            while (sign == 1) {
                List<Map<Integer, Object>> params1 = new ArrayList<Map<Integer, Object>>();
                for (int i = 0; i < 1000; i++) {
                    Map<Integer, Object> map1 = new HashMap<Integer, Object>();
                    map1.put(1, new Double(1));
                    map1.put(2, new Long(TimeUtil.getTimeSimple2()));
                    map1.put(3, 1);
                    map1.put(4, PortUtil.getPort());
                    params1.add(map1);
                }
                insertService.insertTable5(params1);
                sign = InsertSign.INSERT_SIGN.get("insert");
            }
        }
    }


    public static class InsertAll4 extends Thread {

        InsertService insertService;

        public InsertAll4(InsertService insertService) {
            this.insertService = insertService;
        }

        @Override
        public void run() {
            Integer sign = InsertSign.INSERT_SIGN.get("insert");
            while (sign == 1) {
                List<Map<Integer, Object>> params1 = new ArrayList<Map<Integer, Object>>();
                for (int i = 0; i < 1000; i++) {
                    Map<Integer, Object> map1 = new HashMap<Integer, Object>();
                    map1.put(1, new Double(1));
                    map1.put(2, new Long(TimeUtil.getTimeSimple2()));
                    map1.put(3, 1);
                    map1.put(4, PortUtil.getPort());
                    params1.add(map1);
                }
                insertService.insertTable4(params1);
                sign = InsertSign.INSERT_SIGN.get("insert");
            }
        }
    }


    public static class InsertAll3 extends Thread {

        InsertService insertService;

        public InsertAll3(InsertService insertService) {
            this.insertService = insertService;
        }

        @Override
        public void run() {
            Integer sign = InsertSign.INSERT_SIGN.get("insert");
            while (sign == 1) {
                List<Map<Integer, Object>> params1 = new ArrayList<Map<Integer, Object>>();
                for (int i = 0; i < 1000; i++) {
                    Map<Integer, Object> map1 = new HashMap<Integer, Object>();
                    map1.put(1, 1);
                    map1.put(2, new Long(TimeUtil.getTimeSimple2()));
                    map1.put(3, 1);
                    map1.put(4, PortUtil.getPort());
                    map1.put(5, PortUtil.getPort());
                    params1.add(map1);
                }
                insertService.insertTable3(params1);
                sign = InsertSign.INSERT_SIGN.get("insert");
            }
        }
    }


    public static class InsertAll2 extends Thread {
        InsertService insertService;
        public InsertAll2(InsertService insertService) {
            this.insertService = insertService;
        }
        @Override
        public void run() {
            Integer sign = InsertSign.INSERT_SIGN.get("insert");
            while (sign == 1) {
                List<Map<Integer, Object>> params2 = new ArrayList<Map<Integer, Object>>();
                for (int i = 0; i < 1000; i++) {
                    Map<Integer, Object> map2 = new HashMap<Integer, Object>();
                    map2.put(1, new Double(1));
                    map2.put(2, new Double(1));
                    map2.put(3, new Double(1));
                    map2.put(4, new Double(1));
                    map2.put(5, new Double(1));
                    map2.put(6, new Double(1));
                    map2.put(7, new Double(1));
                    map2.put(8, new Double(1));
                    map2.put(9, new Double(1));
                    map2.put(10, new Double(1));
                    map2.put(11, new Double(1));
                    map2.put(12, new Double(1));
                    map2.put(13, new Double(1));
                    map2.put(14, new Double(1));
                    map2.put(15, new Double(1));
                    map2.put(16, new Double(1));
                    map2.put(17, new Double(1));
                    map2.put(18, new Long(TimeUtil.getTimeSimple2()));
                    map2.put(19, 1);
                    map2.put(20, TimeUtil.getTimeAll());
                    params2.add(map2);
                }
                insertService.insertTable2(params2);
                sign = InsertSign.INSERT_SIGN.get("insert");
            }
        }
    }

    public static class InsertAll1 extends Thread {

        InsertService insertService;

        public InsertAll1(InsertService insertService) {
            this.insertService = insertService;
        }

        @Override
        public void run() {
            Integer sign = InsertSign.INSERT_SIGN.get("insert");
            while (sign == 1) {
                List<Map<Integer, Object>> params1 = new ArrayList<Map<Integer, Object>>();
                for (int i = 0; i < 1000; i++) {
                    Map<Integer, Object> map1 = new HashMap<Integer, Object>();
                    map1.put(1, 1);
                    map1.put(2, new Long(TimeUtil.getTimeSimple2()));
                    map1.put(3, 1);
                    map1.put(4, IpUtil.getRandomIp());
                    map1.put(5, IpUtil.getRandomIp());
                    params1.add(map1);
                }
                insertService.insertTable1(params1);
                sign = InsertSign.INSERT_SIGN.get("insert");
            }
        }
    }
}

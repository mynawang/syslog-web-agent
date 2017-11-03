package com.yuhuo.insert;

import com.yuhuo.syslog.IpUtil;
import com.yuhuo.syslog.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Service;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by mynawang on 2017/11/3 0003.
 */
@Service
public class InsertService {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private final static String TABLE1 = "insert into statistic_bab3daaed2d85f0bafb79500e8de1d78 value (?, ?, ?, ?, ?)";
    public void insertTable1(final List<Map<Integer, Object>> params) {
        jdbcTemplate.batchUpdate(TABLE1,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setInt(1, (Integer) params.get(i).get(1));//1
                        ps.setLong(2, (Long) params.get(i).get(2)); //new Long(TimeUtil.getTimeSimple2())
                        ps.setInt(3, (Integer) params.get(i).get(3)); // 1
                        ps.setString(4, (String) params.get(i).get(4)); //IpUtil.getRandomIp()
                        ps.setString(5, (String) params.get(i).get(5)); //IpUtil.getRandomIp()
                    }

                    @Override
                    public int getBatchSize() {
                        return params.size();
                    }
                });
    }

    private final static String TABLE2 ="insert into statistic_80c674f6661503906c5f7abc7643b09d" +
            " values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public void insertTable2(final List<Map<Integer, Object>> params) {
        jdbcTemplate.batchUpdate(TABLE2,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setDouble(1, (Double) params.get(i).get(1));
                        ps.setDouble(2, (Double) params.get(i).get(2));
                        ps.setDouble(3, (Double) params.get(i).get(3));
                        ps.setDouble(4, (Double) params.get(i).get(4));
                        ps.setDouble(5, (Double) params.get(i).get(5));
                        ps.setDouble(6, (Double) params.get(i).get(6));
                        ps.setDouble(7, (Double) params.get(i).get(7));
                        ps.setDouble(8, (Double) params.get(i).get(8));
                        ps.setDouble(9, (Double) params.get(i).get(9));
                        ps.setDouble(10, (Double) params.get(i).get(10));
                        ps.setDouble(11, (Double) params.get(i).get(11));
                        ps.setDouble(12, (Double) params.get(i).get(12));
                        ps.setDouble(13, (Double) params.get(i).get(13));
                        ps.setDouble(14, (Double) params.get(i).get(14));
                        ps.setDouble(15, (Double) params.get(i).get(15));
                        ps.setDouble(16, (Double) params.get(i).get(16));
                        ps.setDouble(17, (Double) params.get(i).get(17));
                        ps.setLong(18, (Long) params.get(i).get(18));
                        ps.setInt(19, (Integer) params.get(i).get(19));
                        ps.setString(20, (String) params.get(i).get(20));
                    }
                    @Override
                    public int getBatchSize() {
                        return params.size();
                    }
                });
    }




    private final static String TABLE3 = "insert into statistic_439d3a50194aefd91f93e2603e17e598 value (?, ?, ?, ?, ?)";
    public void insertTable3(final List<Map<Integer, Object>> params) {
        jdbcTemplate.batchUpdate(TABLE3,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setInt(1, (Integer) params.get(i).get(1));
                        ps.setLong(2, (Long) params.get(i).get(2));
                        ps.setInt(3, (Integer) params.get(i).get(3));
                        ps.setString(4, (String) params.get(i).get(4));
                        ps.setString(5, (String) params.get(i).get(5));
                    }

                    @Override
                    public int getBatchSize() {
                        return params.size();
                    }
                });
    }


    private final static String TABLE4 = "insert into statistic_94ba34670434239c57c855e92c590178 value (?, ?, ?, ?)";
    public void insertTable4(final List<Map<Integer, Object>> params) {
        jdbcTemplate.batchUpdate(TABLE4,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setDouble(1, (Double) params.get(i).get(1));
                        ps.setLong(2, (Long) params.get(i).get(2));
                        ps.setInt(3, (Integer) params.get(i).get(3));
                        ps.setString(4, (String) params.get(i).get(4));
                    }

                    @Override
                    public int getBatchSize() {
                        return params.size();
                    }
                });
    }

    private final static String TABLE5 = "insert into statistic_23971b75a21439938798cc373c9269f6 value (?, ?, ?, ?)";
    public void insertTable5(final List<Map<Integer, Object>> params) {
        jdbcTemplate.batchUpdate(TABLE5,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setDouble(1, (Double) params.get(i).get(1));
                        ps.setLong(2, (Long) params.get(i).get(2));
                        ps.setInt(3, (Integer) params.get(i).get(3));
                        ps.setString(4, (String) params.get(i).get(4));
                    }

                    @Override
                    public int getBatchSize() {
                        return params.size();
                    }
                });
    }


    private final static String TABLE6 = "insert into statistic_4c8d6a675f47d8f8831517e33c5ae7de value (?, ?, ?, ?)";
    public void insertTable6(final List<Map<Integer, Object>> params) {
        jdbcTemplate.batchUpdate(TABLE6,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setDouble(1, (Double) params.get(i).get(1));
                        ps.setLong(2, (Long) params.get(i).get(2));
                        ps.setInt(3, (Integer) params.get(i).get(3));
                        ps.setString(4, (String) params.get(i).get(4));
                    }

                    @Override
                    public int getBatchSize() {
                        return params.size();
                    }
                });
    }


    private final static String TABLE7 = "insert into statistic_495014da6ba5d3ca85d6cb226019e7ef value (?, ?, ?, ?)";
    public void insertTable7(final List<Map<Integer, Object>> params) {
        jdbcTemplate.batchUpdate(TABLE7,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setDouble(1, (Double) params.get(i).get(1));
                        ps.setLong(2, (Long) params.get(i).get(2));
                        ps.setInt(3, (Integer) params.get(i).get(3));
                        ps.setString(4, (String) params.get(i).get(4));
                    }

                    @Override
                    public int getBatchSize() {
                        return params.size();
                    }
                });
    }

    private final static String TABLE8 = "insert into statistic_578a65739a16075ccb394a5517449574 value (?, ?, ?, ?)";
    public void insertTable8(final List<Map<Integer, Object>> params) {
        jdbcTemplate.batchUpdate(TABLE8,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setDouble(1, (Double) params.get(i).get(1));
                        ps.setLong(2, (Long) params.get(i).get(2));
                        ps.setInt(3, (Integer) params.get(i).get(3));
                        ps.setString(4, (String) params.get(i).get(4));
                    }

                    @Override
                    public int getBatchSize() {
                        return params.size();
                    }
                });
    }

    private final static String TABLE9 = "insert into statistic_58e31837460e2ae3e1d6c04c723cb7e7 value (?, ?, ?, ?)";
    public void insertTable9(final List<Map<Integer, Object>> params) {
        jdbcTemplate.batchUpdate(TABLE9,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setDouble(1, (Double) params.get(i).get(1));
                        ps.setLong(2, (Long) params.get(i).get(2));
                        ps.setInt(3, (Integer) params.get(i).get(3));
                        ps.setString(4, (String) params.get(i).get(4));
                    }

                    @Override
                    public int getBatchSize() {
                        return params.size();
                    }
                });
    }




    private final static String TABLE10 ="insert into statistic_391820d8d2ab32bdc277e368d63ca231" +
            " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    public void insertTable10(final List<Map<Integer, Object>> params) {
        jdbcTemplate.batchUpdate(TABLE10,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setDouble(1, (Double) params.get(i).get(1));
                        ps.setDouble(2, (Double) params.get(i).get(2));
                        ps.setDouble(3, (Double) params.get(i).get(3));
                        ps.setDouble(4, (Double) params.get(i).get(4));
                        ps.setDouble(5, (Double) params.get(i).get(5));
                        ps.setDouble(6, (Double) params.get(i).get(6));
                        ps.setLong(7, (Long) params.get(i).get(7));
                        ps.setInt(8, (Integer) params.get(i).get(8));
                        ps.setString(9, (String) params.get(i).get(9));
                    }
                    @Override
                    public int getBatchSize() {
                        return params.size();
                    }
                });
    }



    private final static String TABLE11 = "insert into statistic_cb142b0012261f5684c6217f8615a674 value (?, ?, ?, ?)";
    public void insertTable11(final List<Map<Integer, Object>> params) {
        jdbcTemplate.batchUpdate(TABLE11,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setDouble(1, (Double) params.get(i).get(1));
                        ps.setLong(2, (Long) params.get(i).get(2));
                        ps.setInt(3, (Integer) params.get(i).get(3));
                        ps.setString(4, (String) params.get(i).get(4));
                    }

                    @Override
                    public int getBatchSize() {
                        return params.size();
                    }
                });
    }


    private final static String TABLE12 = "insert into statistic_3c955a2fb727670f0701447d397bc461 value (?, ?, ?, ?)";
    public void insertTable12(final List<Map<Integer, Object>> params) {
        jdbcTemplate.batchUpdate(TABLE12,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        ps.setDouble(1, (Double) params.get(i).get(1));
                        ps.setLong(2, (Long) params.get(i).get(2));
                        ps.setInt(3, (Integer) params.get(i).get(3));
                        ps.setString(4, (String) params.get(i).get(4));
                    }

                    @Override
                    public int getBatchSize() {
                        return params.size();
                    }
                });
    }

}

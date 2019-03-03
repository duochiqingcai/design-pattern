package com.dcqc.demo.service;

import com.dcqc.demo.entity.dos.Table;

/**
 * @program: sim-mysql-data
 * @description
 * @author: duochiqingcai
 * @create: 2019-02-25 17:43
 **/
public interface ITableService {
    /**
     * 创建数据表语句
     * @param table
     * @return
     */
    String createTable(Table table);

    /**
     * 删除数据库语句
     * @param tableName
     * @return
     */
    String dropTable(String tableName);

}

package com.dcqc.demo.service;
/**
 * @program: sim-mysql-data
 * @description
 * @author: duochiqingcai
 * @create: 2019-02-25 17:43
 **/
public interface IDatabaseService {
    /**
     * 创建数据库语句
     */
    String createDatabase(String databaseName);

    /**
     * 卸载数据库语句
     */
    String dropDatabase(String databaseName);

}

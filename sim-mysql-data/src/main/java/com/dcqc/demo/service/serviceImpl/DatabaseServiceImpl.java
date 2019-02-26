package com.dcqc.demo.service.serviceImpl;

import com.dcqc.demo.service.IDatabaseService;

/**
 * @program: sim-mysql-data
 * @description
 * @author: duochiqingcai
 * @create: 2019-02-25 18:58
 **/
public class DatabaseServiceImpl implements IDatabaseService {

    @Override
    public String createDatabase(String databaseName) {
        return "create database"+" "+databaseName;
    }

    @Override
    public String dropDatabase(String databaseName) {
        return "drop database"+" "+databaseName;
    }
}

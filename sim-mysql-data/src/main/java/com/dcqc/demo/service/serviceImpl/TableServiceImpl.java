package com.dcqc.demo.service.serviceImpl;

import com.dcqc.demo.entity.dos.Table;
import com.dcqc.demo.service.ITableService;

/**
 * @program: sim-mysql-data
 * @description
 * @author: duochiqingcai
 * @create: 2019-02-25 19:02
 **/
public class TableServiceImpl implements ITableService {

    @Override
    public String createTable(Table table) {
        return "create table"+table.getTableName();
    }

    @Override
    public String dropTable(String tableName) {
        return null;
    }
}

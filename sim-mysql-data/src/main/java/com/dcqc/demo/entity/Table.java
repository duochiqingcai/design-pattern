package com.dcqc.demo.entity;

import org.springframework.stereotype.Component;

/**
 * @program: sim-mysql-data
 * @description
 * @author: duochiqingcai
 * @create: 2019-02-25 17:51
 **/
@Component
public class Table {
    private String tableName;
    private String tableEngine;
    private String tableCharset;
    private String tableComment;

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableEngine() {
        return tableEngine;
    }

    public void setTableEngine(String tableEngine) {
        this.tableEngine = tableEngine;
    }

    public String getTableCharset() {
        return tableCharset;
    }

    public void setTableCharset(String tableCharset) {
        this.tableCharset = tableCharset;
    }

    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    @Override
    public String toString() {
        return "Table{" +
                "tableName='" + tableName + '\'' +
                ", tableEngine='" + tableEngine + '\'' +
                ", tableCharset='" + tableCharset + '\'' +
                ", tableComment='" + tableComment + '\'' +
                '}';
    }

}

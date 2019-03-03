package com.dcqc.demo.utils;

import com.dcqc.demo.entity.dos.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: sim-mysql-data
 * @description
 * @author: duochiqingcai
 * @create: 2019-02-26 18:51
 **/
@Configuration
public class TableCombinationFactory {
    @Autowired
    private FieldCombinationFactory fieldCombinationFactory;

    /**
     * Table语句抽象生成方法
     * @param
     * @return
     */
    @Bean
    public String CreateTableStatement(Table table){
        return "create table"+" "+table.getTableName();
    }
}

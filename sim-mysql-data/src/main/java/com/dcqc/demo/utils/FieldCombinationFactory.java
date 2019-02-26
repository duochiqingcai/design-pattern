package com.dcqc.demo.utils;

import com.dcqc.demo.entity.Field;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: sim-mysql-data
 * @description
 * @author: duochiqingcai
 * @create: 2019-02-26 23:16
 **/
@Configuration
public class FieldCombinationFactory {
    @Bean
    public String CreateFieldStatement(Field field) {
        String NullCheck = null;
        String PrimaryKeyCheck = null;
        String UniqueIndexCheck = null;

        if (field.isFieldNull()) {
            NullCheck = "";
        } else {
            NullCheck = "not null";
        }

        if (field.isFieldPrimaryKey()) {
            PrimaryKeyCheck = "primary key";
        } else {
            PrimaryKeyCheck = "";
        }

        if (field.isFieldUniqueIndex()) {
            UniqueIndexCheck = "unique";
        } else {
            UniqueIndexCheck = "";
        }

        return field.getFieldName()
                + field.getFieldType() + " "
                + "("
                + field.getFieldLength() + " "
                + ")" + " "
                + NullCheck + " "
                + PrimaryKeyCheck + " "
                + UniqueIndexCheck + " "
                + field.getFieldComment()
                + ",";
    }
}

package com.dcqc.demo.entity;

import org.springframework.stereotype.Component;

/**
 * @program: sim-mysql-data
 * @description
 * @author: duochiqingcai
 * @create: 2019-02-25 17:52
 **/
@Component
public class Field {
    private String fieldName;
    private String fieldType;
    private Integer fieldLength;
    private Integer fieldDecimal;
    private boolean fieldNull;
    private boolean fieldPrimaryKey;
    private boolean fieldUniqueIndex;
    private String fieldComment;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public Integer getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(Integer fieldLength) {
        this.fieldLength = fieldLength;
    }

    public Integer getFieldDecimal() {
        return fieldDecimal;
    }

    public void setFieldDecimal(Integer fieldDecimal) {
        this.fieldDecimal = fieldDecimal;
    }

    public boolean isFieldNull() {
        return fieldNull;
    }

    public void setFieldNull(boolean fieldNull) {
        this.fieldNull = fieldNull;
    }

    public boolean isFieldPrimaryKey() {
        return fieldPrimaryKey;
    }

    public void setFieldPrimaryKey(boolean fieldPrimaryKey) {
        this.fieldPrimaryKey = fieldPrimaryKey;
    }

    public boolean isFieldUniqueIndex() {
        return fieldUniqueIndex;
    }

    public void setFieldUniqueIndex(boolean fieldUniqueIndex) {
        this.fieldUniqueIndex = fieldUniqueIndex;
    }

    public String getFieldComment() {
        return fieldComment;
    }

    public void setFieldComment(String fieldComment) {
        this.fieldComment = fieldComment;
    }

    @Override
    public String toString() {
        return "Field{" +
                "fieldName='" + fieldName + '\'' +
                ", fieldType='" + fieldType + '\'' +
                ", fieldLength=" + fieldLength +
                ", fieldDecimal=" + fieldDecimal +
                ", fieldNull=" + fieldNull +
                ", fieldPrimaryKey=" + fieldPrimaryKey +
                ", fieldUniqueIndex=" + fieldUniqueIndex +
                ", fieldComment='" + fieldComment + '\'' +
                '}';
    }

}

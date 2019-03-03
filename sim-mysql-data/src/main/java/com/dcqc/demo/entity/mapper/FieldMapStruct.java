package com.dcqc.demo.entity.mapper;

import com.dcqc.demo.entity.dos.Field;
import com.dcqc.demo.entity.dtos.FieldDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @program: sim-mysql-data
 * @description
 * @author: duochiqingcai
 * @create: 2019-03-02 12:47
 **/
@Mapper
public interface FieldMapStruct {
    FieldMapStruct INSTANCE= Mappers.getMapper(FieldMapStruct.class);

    @Mapping(source = "fieldNull",target = "isNull")
    FieldDto fieldToFieldDto(Field field);
}

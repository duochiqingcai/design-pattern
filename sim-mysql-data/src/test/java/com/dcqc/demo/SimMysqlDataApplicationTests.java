package com.dcqc.demo;

import com.alibaba.fastjson.JSON;
import com.dcqc.demo.entity.dos.Field;
import com.dcqc.demo.entity.dos.Table;
import com.dcqc.demo.entity.dtos.FieldDto;
import com.dcqc.demo.entity.mapper.FieldMapStruct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimMysqlDataApplicationTests {

    @Test
    public void contextLoads() {
        Field field=new Field();
        field.setFieldComment("这是注释");
        field.setFieldLength(8);
        field.setFieldName("这是名称");
        field.setFieldNull(true);
        field.setFieldType("这是类型");
        FieldDto fieldDto= FieldMapStruct.INSTANCE.fieldToFieldDto(field);

        System.out.println(JSON.toJSON(fieldDto));
    }

}

package com.dcqc.demo;

import com.dcqc.demo.entity.Table;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SimMysqlDataApplicationTests {

    @Test
    public void contextLoads() {
        Table table=new Table();
        table.setTableCharset("utf-8");
        table.setTableComment("这是一段测试代码！");
        table.setTableEngine("Innodb");
        table.setTableName("TestTable");

        System.out.println(table.toString());
    }

}

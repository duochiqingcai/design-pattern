package com.dcqc.demo.web;

import com.dcqc.demo.entity.TestField;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @program: sim-mysql-data
 * @description
 * @author: duochiqingcai
 * @create: 2019-02-27 00:24
 **/
@Controller
public class SqlController {
    private static final Logger LOGGER= LoggerFactory.getLogger(SqlController.class);

    @RequestMapping(value = "/submit/field",method = RequestMethod.POST)
    @ResponseBody
    public String CreateTable(@RequestBody ArrayList<TestField> postData){
        System.out.println(postData.toString());
        return "test data";
    }


}

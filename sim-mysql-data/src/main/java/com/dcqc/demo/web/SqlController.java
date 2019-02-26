package com.dcqc.demo.web;

import com.dcqc.demo.entity.Field;
import com.dcqc.demo.entity.Table;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/submit",method = RequestMethod.POST)
    public void CreateTable(@RequestParam("table")String table){

    }


}

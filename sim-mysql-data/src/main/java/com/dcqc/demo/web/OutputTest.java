package com.dcqc.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

/**
 * @program: sim-mysql-data
 * @description
 * @author: duochiqingcai
 * @create: 2019-02-23 23:36
 **/
@Controller
@RequestMapping
public class OutputTest {

    @RequestMapping("/")
    public String OutputMethod(){
        return "index";
    }
    @RequestMapping("/1")
    public String OutputMethod2(){
        return "mainPage";
    }

}

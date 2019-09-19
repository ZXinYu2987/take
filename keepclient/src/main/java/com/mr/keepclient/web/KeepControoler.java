package com.mr.keepclient.web;

import com.mr.keepclient.service.KeepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class KeepControoler {
    @Value("$server.port")
    String port;
    @Autowired
    private KeepService service;
    @RequestMapping("total")
    @ResponseBody
    public Integer total(){
       Integer num= service.queryCount();
        return num;
    }
    @RequestMapping("addKeep")
    @ResponseBody
    public Integer addKeep(){
        return null;
    }
}

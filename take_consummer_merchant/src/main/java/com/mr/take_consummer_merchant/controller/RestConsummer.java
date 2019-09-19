package com.mr.take_consummer_merchant.controller;

import com.mr.take_consummer_merchant.service.ConsummerMerService;
import com.mr.take_domain.domain.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class RestConsummer {

    @Autowired
    private ConsummerMerService merService;

    @RequestMapping("saveMerchant")
    public Map<String,Integer> saveMerchant(Merchant mer){
        int code=merService.saveMerchant(mer);
        Map<String,Integer> map=new HashMap<>();
        if(code==1){
            map.put("errorCode",1);
        }else{
            map.put("errorCode",2);
        }
        return map;
    }
}

package com.mr.take_consummer_merchant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MerConsummer {

    @RequestMapping("merchantFun")
    public String merchantFun(){
      return "merchant/saveMerchant";
    }


}

package com.mr.merchant_provider.controller;

import com.mr.merchant_provider.service.MerchantService;
import com.mr.take_domain.common.CommonIOUtil;
import com.mr.take_domain.common.DataGridVO;
import com.mr.take_domain.domain.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@RestController
public class RestMerController {

    @Autowired
    private MerchantService merSer;

    //上传图片
    @RequestMapping("upload")
    public String upload(@PathVariable("img")MultipartFile img, HttpServletRequest req){

        String s = CommonIOUtil.uploadFile(img, req, "D://img");
        return  s;
    }

    //商家入驻
    @RequestMapping("saveMerchant")
    public Map<String,Integer> saveMerchant(Merchant mer){
        int code=merSer.saveMerchant(mer);
        Map<String,Integer> map=new HashMap<>();
        if(code==1){
            map.put("errorCode",1);
        }else{
            map.put("errorCode",2);
        }
        return  map;
    }

    //商家入驻查询
    @RequestMapping("queryMerList")
    public DataGridVO queryMerList(){

        DataGridVO dgv=merSer.queryMerList();
        return dgv;
    }

}

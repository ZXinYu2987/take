package com.mr.take_domain.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Store {

    //商铺id
    private Integer sid;

    //商铺地址
    private String saddress;

    //订餐热线
    private String sphone;

    //特色菜品
    private String sdishes;

    //营业时间
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date  sdateB;

    //结束时间
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date sdateE;

    //商铺图片
    private String surl;
}

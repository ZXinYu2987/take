package com.mr.take_domain.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Merchant {

    //商家id
    private Integer mid;

    //店铺名称
    private String shopName;

    //入驻时间
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date mdate;

    //营业执照编号
    private String mcode;

    //法人姓名
    private String mname;

    //法人电话
    private String mphone;

    //店铺logo
    private String murl;
}

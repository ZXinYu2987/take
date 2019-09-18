package com.mr.take_domain.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 浏览历史记录
 * 订单
 */
@Data
public class Order extends Menu  {
//    主键
    private Integer id;
//支付宝生成订单号
    private String payid;
//    创建时间
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date createTime;
//    完成时间
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updateTime;
//
    private Address address;

}

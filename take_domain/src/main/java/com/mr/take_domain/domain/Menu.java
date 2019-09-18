package com.mr.take_domain.domain;

import lombok.Data;

@Data
public class Menu {

    //菜谱id
    private Integer mid;

    //菜谱价格
    private Double mprice;

    //菜谱名称
    private String mname;

    //图片
    private String murl;
}

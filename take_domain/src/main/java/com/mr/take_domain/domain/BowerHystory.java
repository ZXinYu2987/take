package com.mr.take_domain.domain;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 浏览历史记录
 */
@Data
public class BowerHystory {
//    主键
    private Integer id;
//    用户名称
    private String username;
//    浏览记录 商家
    private Store msg;
//    浏览时间.
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date now;


}

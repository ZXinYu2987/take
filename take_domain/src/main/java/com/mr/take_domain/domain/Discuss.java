package com.mr.take_domain.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Discuss {
    private Integer dId;
    private String dContent;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8",pattern = "yyyy-MM-dd")
    private Date dTime;
    private Integer sId;
    private Integer mId;
    private Integer userId;

}

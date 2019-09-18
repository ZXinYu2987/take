package com.mr.take_domain.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class UserVO {

    private Integer userId;
    private String userName;
    private String userPwd;
    private String userPhone;
    private String userEmail;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(timezone = "GMT+8")
    private Date userLoginTime;
    private String userHeadPhoto;

}

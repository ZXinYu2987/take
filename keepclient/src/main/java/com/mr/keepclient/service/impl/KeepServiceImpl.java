package com.mr.keepclient.service.impl;

import com.mr.keepclient.mapper.KeepMapper;
import com.mr.keepclient.service.KeepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KeepServiceImpl implements KeepService {
    @Autowired
    private KeepMapper mapper;
    @Override
    public Integer queryCount() {
        Integer num=mapper.queryCount();
        return num;
    }
}

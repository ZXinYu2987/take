package com.mr.merchant_provider.service.impl;

import com.mr.merchant_provider.mapper.MerchantMapper;
import com.mr.merchant_provider.service.MerchantService;
import com.mr.take_domain.common.DataGridVO;
import com.mr.take_domain.domain.Merchant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service("merSer")
public class MarchantServiceImpl implements MerchantService {

    @Autowired
    private MerchantMapper merchantMapper;

    @Override
    public int saveMerchant(Merchant mer) {
        mer.setMdate(new Date());
        return merchantMapper.saveMerchant(mer);
    }

    @Override
    public DataGridVO queryMerList() {
        int total=merchantMapper.queryCount();
        List<Merchant> merchantList=merchantMapper.queryMerList();
        DataGridVO dgv=new DataGridVO();
        dgv.setRows(merchantList);
        dgv.setTotal(total);
        return dgv;
    }
}

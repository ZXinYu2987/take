package com.mr.merchant_provider.service;

import com.mr.take_domain.common.DataGridVO;
import com.mr.take_domain.domain.Merchant;

public interface MerchantService {

    //入驻商家
    int saveMerchant(Merchant mer);

    //查询商家
    DataGridVO queryMerList();
}

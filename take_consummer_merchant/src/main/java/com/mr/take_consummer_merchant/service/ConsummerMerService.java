package com.mr.take_consummer_merchant.service;

import com.mr.take_domain.domain.Merchant;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient("PROVIDER-HELLO")
public interface ConsummerMerService {

    @RequestMapping("/saveMerchant")
    int saveMerchant(@RequestBody Merchant mer);
}

package com.pbpmall.pbpmallmember.feign;

import com.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient("pbpmall-coupon")
public interface CouponFeignService {

    @RequestMapping("/pbpmallcoupon/coupon/list")
    public R list(@RequestParam Map<String, Object> params);
}

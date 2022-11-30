package com.pbpmall.pbpmallcoupon.dao;

import com.pbpmall.pbpmallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author pbp
 * @email pengbaiping@gmail.com
 * @date 2022-11-30 10:38:46
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

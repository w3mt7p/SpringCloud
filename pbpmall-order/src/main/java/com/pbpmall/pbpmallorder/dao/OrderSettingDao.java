package com.pbpmall.pbpmallorder.dao;

import com.pbpmall.pbpmallorder.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author pbp
 * @email pengbaiping@gmail.com
 * @date 2022-11-30 10:49:03
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}

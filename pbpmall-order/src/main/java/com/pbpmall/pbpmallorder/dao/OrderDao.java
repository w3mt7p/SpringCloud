package com.pbpmall.pbpmallorder.dao;

import com.pbpmall.pbpmallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author pbp
 * @email pengbaiping@gmail.com
 * @date 2022-11-30 10:49:03
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}

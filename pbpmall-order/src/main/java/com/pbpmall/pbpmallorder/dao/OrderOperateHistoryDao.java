package com.pbpmall.pbpmallorder.dao;

import com.pbpmall.pbpmallorder.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author pbp
 * @email pengbaiping@gmail.com
 * @date 2022-11-30 10:49:03
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}

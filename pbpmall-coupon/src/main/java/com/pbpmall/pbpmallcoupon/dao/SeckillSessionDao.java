package com.pbpmall.pbpmallcoupon.dao;

import com.pbpmall.pbpmallcoupon.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author pbp
 * @email pengbaiping@gmail.com
 * @date 2022-11-30 10:38:46
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}

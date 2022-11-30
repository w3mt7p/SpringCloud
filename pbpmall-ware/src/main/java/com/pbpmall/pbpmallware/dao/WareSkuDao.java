package com.pbpmall.pbpmallware.dao;

import com.pbpmall.pbpmallware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author pbp
 * @email pengbaiping@gmail.com
 * @date 2022-11-30 10:53:02
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}

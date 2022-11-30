package com.pbpmall.pbpmallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.pbpmall.pbpmallware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author pbp
 * @email pengbaiping@gmail.com
 * @date 2022-11-30 10:53:02
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


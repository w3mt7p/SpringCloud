package com.pbpmall.pbpmallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.pbpmall.pbpmallware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author pbp
 * @email pengbaiping@gmail.com
 * @date 2022-11-30 10:53:02
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


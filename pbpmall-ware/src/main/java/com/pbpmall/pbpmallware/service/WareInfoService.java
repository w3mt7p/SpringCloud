package com.pbpmall.pbpmallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.common.utils.PageUtils;
import com.pbpmall.pbpmallware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author pbp
 * @email pengbaiping@gmail.com
 * @date 2022-11-30 10:53:02
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}


package com.pbpmall.pbpmallmember.dao;

import com.pbpmall.pbpmallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author pbp
 * @email pengbaiping@gmail.com
 * @date 2022-11-30 10:45:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

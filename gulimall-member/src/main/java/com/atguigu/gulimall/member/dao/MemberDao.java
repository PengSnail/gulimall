package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author PengG
 * @email zhipeng620@gmail.com
 * @date 2020-12-29 23:09:07
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}

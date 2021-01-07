package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author PengG
 * @email zhipeng620@gmail.com
 * @date 2020-12-29 23:52:06
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}

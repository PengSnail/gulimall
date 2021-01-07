package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author PengG
 * @email zhipeng620@gmail.com
 * @date 2020-12-29 23:52:06
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}

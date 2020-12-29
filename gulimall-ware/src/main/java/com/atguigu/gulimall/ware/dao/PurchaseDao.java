package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author PengG
 * @email zhipeng620@gmail.com
 * @date 2020-12-29 23:19:07
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}

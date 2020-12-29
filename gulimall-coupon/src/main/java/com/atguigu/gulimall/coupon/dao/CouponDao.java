package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author PengG
 * @email zhipeng620@gmail.com
 * @date 2020-12-29 23:00:22
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}

package org.example.emall.coupon.dao;

import org.example.emall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author lucasxu
 * @email sunlightcs@gmail.com
 * @date 2023-10-07 02:09:25
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}

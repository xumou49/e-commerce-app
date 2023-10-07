package org.example.emall.order.dao;

import org.example.emall.order.entity.OmsOrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author lucasxu
 * @email sunlightcs@gmail.com
 * @date 2023-10-07 03:03:09
 */
@Mapper
public interface OmsOrderDao extends BaseMapper<OmsOrderEntity> {
	
}

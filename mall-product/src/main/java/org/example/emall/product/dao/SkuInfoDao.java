package org.example.emall.product.dao;

import org.example.emall.product.entity.SkuInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * sku信息
 * 
 * @author lucasxu
 * @email sunlightcs@gmail.com
 * @date 2023-10-06 22:03:36
 */
@Mapper
public interface SkuInfoDao extends BaseMapper<SkuInfoEntity> {
	
}

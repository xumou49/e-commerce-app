package org.example.emall.ware.dao;

import org.example.emall.ware.entity.WmsWareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author lucasxu
 * @email sunlightcs@gmail.com
 * @date 2023-10-07 03:11:00
 */
@Mapper
public interface WmsWareSkuDao extends BaseMapper<WmsWareSkuEntity> {
	
}

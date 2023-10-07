package org.example.emall.order.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.common.utils.PageUtils;
import org.example.common.utils.Query;

import org.example.emall.order.dao.OmsOrderItemDao;
import org.example.emall.order.entity.OmsOrderItemEntity;
import org.example.emall.order.service.OmsOrderItemService;


@Service("omsOrderItemService")
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemDao, OmsOrderItemEntity> implements OmsOrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OmsOrderItemEntity> page = this.page(
                new Query<OmsOrderItemEntity>().getPage(params),
                new QueryWrapper<OmsOrderItemEntity>()
        );

        return new PageUtils(page);
    }

}
package org.example.emall.member.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.example.common.utils.PageUtils;
import org.example.common.utils.Query;

import org.example.emall.member.dao.UmsMemberLevelDao;
import org.example.emall.member.entity.UmsMemberLevelEntity;
import org.example.emall.member.service.UmsMemberLevelService;


@Service("umsMemberLevelService")
public class UmsMemberLevelServiceImpl extends ServiceImpl<UmsMemberLevelDao, UmsMemberLevelEntity> implements UmsMemberLevelService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<UmsMemberLevelEntity> page = this.page(
                new Query<UmsMemberLevelEntity>().getPage(params),
                new QueryWrapper<UmsMemberLevelEntity>()
        );

        return new PageUtils(page);
    }

}
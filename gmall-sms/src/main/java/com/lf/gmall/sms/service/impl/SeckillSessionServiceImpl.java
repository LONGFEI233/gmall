package com.lf.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;

import com.lf.gmall.sms.mapper.SeckillSessionMapper;
import com.lf.gmall.sms.entity.SeckillSessionEntity;
import com.lf.gmall.sms.service.SeckillSessionService;


@Service("seckillSessionService")
public class SeckillSessionServiceImpl extends ServiceImpl<SeckillSessionMapper, SeckillSessionEntity> implements SeckillSessionService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<SeckillSessionEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<SeckillSessionEntity>()
        );

        return new PageResultVo(page);
    }

}
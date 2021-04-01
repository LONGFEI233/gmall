package com.lf.gmall.wms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;

import com.lf.gmall.wms.mapper.WareMapper;
import com.lf.gmall.wms.entity.WareEntity;
import com.lf.gmall.wms.service.WareService;


@Service("wareService")
public class WareServiceImpl extends ServiceImpl<WareMapper, WareEntity> implements WareService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<WareEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<WareEntity>()
        );

        return new PageResultVo(page);
    }

}
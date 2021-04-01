package com.lf.gmall.wms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;

import com.lf.gmall.wms.mapper.WareOrderBillDetailMapper;
import com.lf.gmall.wms.entity.WareOrderBillDetailEntity;
import com.lf.gmall.wms.service.WareOrderBillDetailService;


@Service("wareOrderBillDetailService")
public class WareOrderBillDetailServiceImpl extends ServiceImpl<WareOrderBillDetailMapper, WareOrderBillDetailEntity> implements WareOrderBillDetailService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<WareOrderBillDetailEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<WareOrderBillDetailEntity>()
        );

        return new PageResultVo(page);
    }

}
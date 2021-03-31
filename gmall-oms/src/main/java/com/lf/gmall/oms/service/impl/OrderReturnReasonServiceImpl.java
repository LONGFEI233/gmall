package com.lf.gmall.oms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;

import com.lf.gmall.oms.mapper.OrderReturnReasonMapper;
import com.lf.gmall.oms.entity.OrderReturnReasonEntity;
import com.lf.gmall.oms.service.OrderReturnReasonService;


@Service("orderReturnReasonService")
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonMapper, OrderReturnReasonEntity> implements OrderReturnReasonService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<OrderReturnReasonEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<OrderReturnReasonEntity>()
        );

        return new PageResultVo(page);
    }

}
package com.lf.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;
import com.lf.gmall.oms.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author lf
 * @email lf@atguigu.com
 * @date 2021-04-01 01:42:04
 */
public interface OrderService extends IService<OrderEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}


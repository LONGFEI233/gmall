package com.lf.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;
import com.lf.gmall.sms.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author lf
 * @email lf@atguigu.com
 * @date 2021-04-01 20:11:23
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}


package com.lf.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;
import com.lf.gmall.sms.entity.SkuLadderEntity;

import java.util.Map;

/**
 * 商品阶梯价格
 *
 * @author lf
 * @email lf@atguigu.com
 * @date 2021-04-01 20:11:23
 */
public interface SkuLadderService extends IService<SkuLadderEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}


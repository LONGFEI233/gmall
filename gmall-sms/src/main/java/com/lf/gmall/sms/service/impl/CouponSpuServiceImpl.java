package com.lf.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;

import com.lf.gmall.sms.mapper.CouponSpuMapper;
import com.lf.gmall.sms.entity.CouponSpuEntity;
import com.lf.gmall.sms.service.CouponSpuService;


@Service("couponSpuService")
public class CouponSpuServiceImpl extends ServiceImpl<CouponSpuMapper, CouponSpuEntity> implements CouponSpuService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<CouponSpuEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<CouponSpuEntity>()
        );

        return new PageResultVo(page);
    }

}
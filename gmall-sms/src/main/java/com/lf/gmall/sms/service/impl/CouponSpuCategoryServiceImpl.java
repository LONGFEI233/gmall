package com.lf.gmall.sms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;

import com.lf.gmall.sms.mapper.CouponSpuCategoryMapper;
import com.lf.gmall.sms.entity.CouponSpuCategoryEntity;
import com.lf.gmall.sms.service.CouponSpuCategoryService;


@Service("couponSpuCategoryService")
public class CouponSpuCategoryServiceImpl extends ServiceImpl<CouponSpuCategoryMapper, CouponSpuCategoryEntity> implements CouponSpuCategoryService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<CouponSpuCategoryEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<CouponSpuCategoryEntity>()
        );

        return new PageResultVo(page);
    }

}
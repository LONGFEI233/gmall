package com.lf.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;
import com.lf.gmall.pms.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author lf
 * @email lf@atguigu.com
 * @date 2021-04-01 15:29:03
 */
public interface BrandService extends IService<BrandEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}


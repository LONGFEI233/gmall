package com.lf.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;
import com.lf.gmall.sms.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * δΈι’εε
 *
 * @author lf
 * @email lf@atguigu.com
 * @date 2021-04-01 20:11:23
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}


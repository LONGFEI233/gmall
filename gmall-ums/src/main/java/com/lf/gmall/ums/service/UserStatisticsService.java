package com.lf.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;
import com.lf.gmall.ums.entity.UserStatisticsEntity;

import java.util.Map;

/**
 * 统计信息表
 *
 * @author lf
 * @email lf@atguigu.com
 * @date 2021-04-01 20:26:03
 */
public interface UserStatisticsService extends IService<UserStatisticsEntity> {

    PageResultVo queryPage(PageParamVo paramVo);
}


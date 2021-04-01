package com.lf.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;

import com.lf.gmall.ums.mapper.UserLoginLogMapper;
import com.lf.gmall.ums.entity.UserLoginLogEntity;
import com.lf.gmall.ums.service.UserLoginLogService;


@Service("userLoginLogService")
public class UserLoginLogServiceImpl extends ServiceImpl<UserLoginLogMapper, UserLoginLogEntity> implements UserLoginLogService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<UserLoginLogEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<UserLoginLogEntity>()
        );

        return new PageResultVo(page);
    }

}
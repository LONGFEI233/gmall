package com.lf.gmall.ums.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.PageParamVo;

import com.lf.gmall.ums.mapper.UserAddressMapper;
import com.lf.gmall.ums.entity.UserAddressEntity;
import com.lf.gmall.ums.service.UserAddressService;


@Service("userAddressService")
public class UserAddressServiceImpl extends ServiceImpl<UserAddressMapper, UserAddressEntity> implements UserAddressService {

    @Override
    public PageResultVo queryPage(PageParamVo paramVo) {
        IPage<UserAddressEntity> page = this.page(
                paramVo.getPage(),
                new QueryWrapper<UserAddressEntity>()
        );

        return new PageResultVo(page);
    }

}
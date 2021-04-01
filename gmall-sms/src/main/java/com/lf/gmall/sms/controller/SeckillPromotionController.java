package com.lf.gmall.sms.controller;

import java.util.List;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lf.gmall.sms.entity.SeckillPromotionEntity;
import com.lf.gmall.sms.service.SeckillPromotionService;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.ResponseVo;
import com.lf.gmall.common.bean.PageParamVo;

/**
 * 秒杀活动
 *
 * @author lf
 * @email lf@atguigu.com
 * @date 2021-04-01 20:11:23
 */
@Api(tags = "秒杀活动 管理")
@RestController
@RequestMapping("sms/seckillpromotion")
public class SeckillPromotionController {

    @Autowired
    private SeckillPromotionService seckillPromotionService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation("分页查询")
    public ResponseVo<PageResultVo> querySeckillPromotionByPage(PageParamVo paramVo){
        PageResultVo pageResultVo = seckillPromotionService.queryPage(paramVo);

        return ResponseVo.ok(pageResultVo);
    }


    /**
     * 信息
     */
    @GetMapping("{id}")
    @ApiOperation("详情查询")
    public ResponseVo<SeckillPromotionEntity> querySeckillPromotionById(@PathVariable("id") Long id){
		SeckillPromotionEntity seckillPromotion = seckillPromotionService.getById(id);

        return ResponseVo.ok(seckillPromotion);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("保存")
    public ResponseVo<Object> save(@RequestBody SeckillPromotionEntity seckillPromotion){
		seckillPromotionService.save(seckillPromotion);

        return ResponseVo.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("修改")
    public ResponseVo update(@RequestBody SeckillPromotionEntity seckillPromotion){
		seckillPromotionService.updateById(seckillPromotion);

        return ResponseVo.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除")
    public ResponseVo delete(@RequestBody List<Long> ids){
		seckillPromotionService.removeByIds(ids);

        return ResponseVo.ok();
    }

}

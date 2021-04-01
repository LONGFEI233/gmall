package com.lf.gmall.wms.controller;

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

import com.lf.gmall.wms.entity.WareOrderBillDetailEntity;
import com.lf.gmall.wms.service.WareOrderBillDetailService;
import com.lf.gmall.common.bean.PageResultVo;
import com.lf.gmall.common.bean.ResponseVo;
import com.lf.gmall.common.bean.PageParamVo;

/**
 * 库存工作单
 *
 * @author lf
 * @email lf@atguigu.com
 * @date 2021-04-01 20:33:09
 */
@Api(tags = "库存工作单 管理")
@RestController
@RequestMapping("wms/wareorderbilldetail")
public class WareOrderBillDetailController {

    @Autowired
    private WareOrderBillDetailService wareOrderBillDetailService;

    /**
     * 列表
     */
    @GetMapping
    @ApiOperation("分页查询")
    public ResponseVo<PageResultVo> queryWareOrderBillDetailByPage(PageParamVo paramVo){
        PageResultVo pageResultVo = wareOrderBillDetailService.queryPage(paramVo);

        return ResponseVo.ok(pageResultVo);
    }


    /**
     * 信息
     */
    @GetMapping("{id}")
    @ApiOperation("详情查询")
    public ResponseVo<WareOrderBillDetailEntity> queryWareOrderBillDetailById(@PathVariable("id") Long id){
		WareOrderBillDetailEntity wareOrderBillDetail = wareOrderBillDetailService.getById(id);

        return ResponseVo.ok(wareOrderBillDetail);
    }

    /**
     * 保存
     */
    @PostMapping
    @ApiOperation("保存")
    public ResponseVo<Object> save(@RequestBody WareOrderBillDetailEntity wareOrderBillDetail){
		wareOrderBillDetailService.save(wareOrderBillDetail);

        return ResponseVo.ok();
    }

    /**
     * 修改
     */
    @PostMapping("/update")
    @ApiOperation("修改")
    public ResponseVo update(@RequestBody WareOrderBillDetailEntity wareOrderBillDetail){
		wareOrderBillDetailService.updateById(wareOrderBillDetail);

        return ResponseVo.ok();
    }

    /**
     * 删除
     */
    @PostMapping("/delete")
    @ApiOperation("删除")
    public ResponseVo delete(@RequestBody List<Long> ids){
		wareOrderBillDetailService.removeByIds(ids);

        return ResponseVo.ok();
    }

}
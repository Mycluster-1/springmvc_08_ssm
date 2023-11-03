package com.zm.controller;

import com.zm.domain.Brand;
import com.zm.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandController {

    private BrandService brandService;

    @Autowired
    public void setBrandService(BrandService brandService) {
        this.brandService = brandService;
    }

    @DeleteMapping("/{id}")
    public Result deleteByPrimaryKey(@PathVariable("id") Integer id) {
        boolean flag = brandService.deleteByPrimaryKey(id);
        return Result.builder().code(flag ? Code.DELETE_OK : Code.DELETE_ERR).data(flag).build();
    }

    @PostMapping
    public Result insert(@RequestBody Brand record) {
        boolean flag = brandService.insert(record);
        return Result.builder().code(flag ? Code.SAVE_OK : Code.SAVE_ERR).data(flag).build();
    }

    @GetMapping("/{id}")
    public Result selectByPrimaryKey(@PathVariable("id") Integer id) {
        Brand brand = brandService.selectByPrimaryKey(id);
        Integer code = brand != null ? Code.GET_0K : Code.GET_ERR;
        String msg = brand != null ? "" : "查询失败,请重试";
        return Result.builder().code(code).data(brand).msg(msg).build();
    }

    @PutMapping
    public Result updateByPrimaryKey(@RequestBody Brand record) {
        boolean flag = brandService.updateByPrimaryKey(record);
        return Result.builder().code(flag ? Code.UPDATE_OK : Code.UPDATE_ERR).data(flag).build();
    }

    @GetMapping
    public Result selectAll() {
        List<Brand> brandList = brandService.selectAll();
        Integer code = brandList != null ? Code.GET_0K : Code.GET_ERR;
        String msg = brandList != null ? "" : "查询失败,请重试";
        return Result.builder().code(code).data(brandList).msg(msg).build();
    }
}

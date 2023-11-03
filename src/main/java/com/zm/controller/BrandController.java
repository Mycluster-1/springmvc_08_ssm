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
    public boolean deleteByPrimaryKey(@PathVariable("id") Integer id) {
        System.out.println("删除");
        return brandService.deleteByPrimaryKey(id);
    }

    @PostMapping
    public boolean insert(@RequestBody Brand record) {
        return brandService.insert(record);
    }

    @GetMapping("/{id}")
    public Brand selectByPrimaryKey(@PathVariable("id") Integer id) {
        System.out.println("查询单个");
        return brandService.selectByPrimaryKey(id);
    }

    @PutMapping
    public boolean updateByPrimaryKey(@RequestBody Brand record) {
        return brandService.updateByPrimaryKey(record);
    }

    @GetMapping
    public List<Brand> selectAll() {
        return brandService.selectAll();
    }
}

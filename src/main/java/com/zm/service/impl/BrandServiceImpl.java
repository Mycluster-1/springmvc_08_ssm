package com.zm.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.zm.domain.Brand;
import com.zm.dao.BrandDao;
import com.zm.service.BrandService;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService{


    @Resource
    private BrandDao brandDao;

    @Override
    public boolean deleteByPrimaryKey(Integer id) {
        return brandDao.deleteByPrimaryKey(id);
    }

    @Override
    public boolean insert(Brand record) {
        return brandDao.insert(record);
    }

    @Override
    public Brand selectByPrimaryKey(Integer id) {
        return brandDao.selectByPrimaryKey(id);
    }

    @Override
    public boolean updateByPrimaryKey(Brand record) {
        return brandDao.updateByPrimaryKey(record);
    }

    @Override
    public List<Brand> selectAll() {
        return brandDao.selectAll();
    }

}

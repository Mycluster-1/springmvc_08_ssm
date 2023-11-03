package com.zm.service;

import com.zm.domain.Brand;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface BrandService {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Brand record);

    Brand selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKey(Brand record);

    List<Brand> selectAll();
}


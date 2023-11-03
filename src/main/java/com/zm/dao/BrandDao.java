package com.zm.dao;

import com.zm.domain.Brand;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
public interface BrandDao {
    boolean deleteByPrimaryKey(Integer id);

    boolean insert(Brand record);

    Brand selectByPrimaryKey(Integer id);

    boolean updateByPrimaryKey(Brand record);

    List<Brand> selectAll();
}
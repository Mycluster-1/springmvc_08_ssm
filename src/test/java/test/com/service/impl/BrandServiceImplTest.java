package test.com.service.impl;

import com.zm.config.SpringConfig;
import com.zm.domain.Brand;
import com.zm.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BrandServiceImplTest {

    private BrandService brandService;

    @Autowired
    public void setBrandService(BrandService brandService) {
        this.brandService = brandService;
    }

    @Test
    public void deleteByPrimaryKey() {
    }

    @Test
    public void insert() {
    }

    @Test
    public void selectByPrimaryKey() {
        Brand brand = brandService.selectByPrimaryKey(1);
        System.out.println(brand);
    }

    @Test
    public void updateByPrimaryKey() {
    }

    @Test
    public void selectAll() {
    }
}
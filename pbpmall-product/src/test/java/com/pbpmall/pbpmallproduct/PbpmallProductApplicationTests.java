package com.pbpmall.pbpmallproduct;

import com.pbpmall.pbpmallproduct.entity.BrandEntity;
import com.pbpmall.pbpmallproduct.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PbpmallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    public void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("test");
        brandService.save(brandEntity);
        System.out.println("success");
    }

}

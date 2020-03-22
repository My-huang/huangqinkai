package io.hqk.jcartstoreback.service.impl;

import io.hqk.jcartstoreback.dao.ProductOperationMapper;
import io.hqk.jcartstoreback.po.ProductOperation;
import io.hqk.jcartstoreback.service.ProductOperationService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

public class ProductOperationImplService implements ProductOperationService {


    @Autowired
    private ProductOperationMapper productOperationMapper;

    @Override
    public void count(Integer productId) {

        ProductOperation productOperation = productOperationMapper.selectByPrimaryKey(productId);

        if(productOperation == null){
            productOperation = new ProductOperation();
            productOperation.setProductId(productId);
            productOperation.setAllCount(1);
            productOperation.setDayCount(1);
            productOperation.setRecentTime(new Date());
            productOperationMapper.insertSelective(productOperation);
        }else{
            productOperation.setAllCount(productOperation.getAllCount()+1);
            productOperation.setDayCount(productOperation.getDayCount()+1);
            productOperation.setRecentTime(new Date());

            productOperationMapper.updateByPrimaryKeySelective(productOperation);
        }

    }
}

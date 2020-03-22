package io.hqk.jcartstoreback.dao;

import io.hqk.jcartstoreback.po.ProductOperation;
import org.springframework.stereotype.Component;

@Component
public interface ProductOperationMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(ProductOperation record);

    int insertSelective(ProductOperation record);

    ProductOperation selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(ProductOperation record);

    int updateByPrimaryKey(ProductOperation record);
}
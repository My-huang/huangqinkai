package io.hqk.jcartadministrayionback.dao;

import io.hqk.jcartadministrayionback.po.ProductDetail;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestPart;

@Repository
public interface ProductDetailMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(ProductDetail record);

    int insertSelective(ProductDetail record);

    ProductDetail selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(ProductDetail record);

    int updateByPrimaryKeyWithBLOBs(ProductDetail record);

    int updateByPrimaryKey(ProductDetail record);
}
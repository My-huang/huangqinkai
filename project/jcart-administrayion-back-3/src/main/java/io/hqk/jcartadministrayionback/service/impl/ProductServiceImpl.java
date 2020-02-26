package io.hqk.jcartadministrayionback.service.impl;


import io.hqk.jcartadministrayionback.dao.ProductDetailMapper;
import io.hqk.jcartadministrayionback.dao.ProductMapper;
import io.hqk.jcartadministrayionback.dto.out.ProductShowOutDTO;
import io.hqk.jcartadministrayionback.po.Product;
import io.hqk.jcartadministrayionback.po.ProductDetail;
import io.hqk.jcartadministrayionback.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper productMapper;

    @Autowired
    private ProductDetailMapper productDetailMapper;

    @Override
    public ProductShowOutDTO getById(Integer productId) {

        Product product = productMapper.selectByPrimaryKey(productId);
        ProductDetail productDetail = productDetailMapper.selectByPrimaryKey(productId);

        ProductShowOutDTO productShowOutDTO = new ProductShowOutDTO();
        productShowOutDTO.setProductId(product.getProductId());
        productShowOutDTO.setProductCode(product.getProductCode());
        productShowOutDTO.setProductName(product.getProductName());
        productShowOutDTO.setPrice(product.getPrice());
        productShowOutDTO.setDiscount(product.getDiscount());
        productShowOutDTO.setMainPicUrl(product.getMainPicUrl());
        productShowOutDTO.setRewordPoints(product.getRewordPoints());
        productShowOutDTO.setStockQuantity(product.getStockQuantity());

        productShowOutDTO.setDescription(productDetail.getDescription());
        String otherPicUrlsJson = productDetail.getOtherPicUrls();
//        List<String> otherPicUrls = JSON.parseArray(otherPicUrlsJson, String.class);
//        productShowOutDTO.setOtherPicUrls(otherPicUrls);

        return productShowOutDTO;
    }
}

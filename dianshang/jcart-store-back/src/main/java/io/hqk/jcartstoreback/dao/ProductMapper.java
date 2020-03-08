package io.hqk.jcartstoreback.dao;

import com.github.pagehelper.Page;
import io.hqk.jcartstoreback.dto.out.ProductListOutDTO;
import io.hqk.jcartstoreback.po.Product;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(Integer productId);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

//    custom

    Page<ProductListOutDTO> search();

}
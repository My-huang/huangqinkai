package io.hqk.jcartstoreback.service;


import com.github.pagehelper.Page;
import io.hqk.jcartstoreback.dto.out.ProductListOutDTO;
import io.hqk.jcartstoreback.dto.out.ProductShowOutDTO;
import io.hqk.jcartstoreback.po.Product;

public interface ProductService {

    Product getById(Integer productId);

    ProductShowOutDTO getShowById(Integer productId);

    Page<ProductListOutDTO> search(Integer pageNum);

}

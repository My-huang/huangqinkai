package io.hqk.jcartadministrayionback.service;


import io.hqk.jcartadministrayionback.dto.out.ProductShowOutDTO;

public interface ProductService {

    ProductShowOutDTO getById(Integer productId);

}

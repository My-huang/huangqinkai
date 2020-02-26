package io.hqk.jcartadministrayionback.controller;


import io.hqk.jcartadministrayionback.dto.in.ProductSearchInDTO;
import io.hqk.jcartadministrayionback.dto.out.PageOutDTO;
import io.hqk.jcartadministrayionback.dto.out.ProductListOutDTO;
import io.hqk.jcartadministrayionback.dto.out.ProductShowOutDTO;
import io.hqk.jcartadministrayionback.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/search")
    public PageOutDTO<ProductListOutDTO> search(ProductSearchInDTO productSearchInDTO,
                                                @RequestParam Integer pageNum){
        return null;
    }

    @GetMapping("/getById")
    public ProductShowOutDTO getById(@RequestParam Integer productId){
        ProductShowOutDTO productShowOutDTO = productService.getById(productId);
        return productShowOutDTO;
    }

}

package io.hqk.jcartadministrayionback.controller;

import io.hqk.jcartadministrayionback.dto.out.CommodityDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/commodity")
public class CommodityController {


    @GetMapping("/search")
    public String search(String productName,Integer price){

        return null;
    }


    @PostMapping("/add")
    public Integer add(CommodityDTO commodityDTO){

        return 0;
    }



}

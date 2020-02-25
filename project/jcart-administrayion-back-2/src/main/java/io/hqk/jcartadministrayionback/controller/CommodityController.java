package io.hqk.jcartadministrayionback.controller;

import io.hqk.jcartadministrayionback.dto.out.CommodityDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/commodity")
public class CommodityController {


    @GetMapping("/search")
    public String search(@RequestParam String productName,
                         @RequestParam Integer price){

        return null;
    }


    @PostMapping("/add")
    public Integer add(@RequestPart CommodityDTO commodityDTO){

        return 0;
    }



}

package io.hqk.jcartadministrayionback.controller;

import io.hqk.jcartadministrayionback.dto.out.ReturnDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/return")
public class ReturnController {

    @GetMapping("/search")
    public String search(Integer orderId,String customerName){

        return null;
    }

    public ReturnDTO sales(Integer returnHistoryId){

        return null;
    }

}

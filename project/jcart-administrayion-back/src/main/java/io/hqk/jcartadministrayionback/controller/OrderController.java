package io.hqk.jcartadministrayionback.controller;

import io.hqk.jcartadministrayionback.dto.out.OrderDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/search")
    public String search(Integer customerId, Date createTime){

        return null;
    }

    @PostMapping("/particulars")
    public OrderDTO particulars(Integer orderId){

        return null;
    }

    @GetMapping("/invoice")
    public String invoice(Integer orderId){

        return null;
    }


}

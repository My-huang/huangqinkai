package io.hqk.jcartadministrayionback.controller;

import io.hqk.jcartadministrayionback.dto.out.OrderDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/search")
    public String search(@RequestParam Integer customerId,
                         @RequestParam Date createTime){

        return null;
    }

    @PostMapping("/particulars")
    public OrderDTO particulars(@RequestParam Integer orderId){

        return null;
    }

    @GetMapping("/invoice")
    public String invoice(@RequestParam Integer orderId){

        return null;
    }


}
